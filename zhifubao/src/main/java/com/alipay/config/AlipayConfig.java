package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092800612833";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCIV5UYEElsCLkXD1bWzRTchsMK8oCHuPHQmTX1k+payYr1mxH2axm6s5M8kw2k/CLgyz0lX6YDIxVd52qumGFJFSQG6EvERxwe71Ov8ia54r8ZUgTlVhfgmior7Hg6IRklsn6E6JaTvyUjM44h59jgOVChk+CF37Mnv6DQSCvPB1WWlNdEEljiriq17L2USuWyKtH63Xz0n7QLU5dEpNiJFuNNTtyweV2mUnwFbhViu3CDaSHkAgP387wo5cOFkVQAPeBOU+PuOw0XG1amdyjFGML5Di/iDeXMUokMuwcaDp4X0B2qcs5mbgRG7v1CHnsAxK1wkQkNcaSdoHGlrs3LAgMBAAECggEAa9yV+AaSf2RbQXICKkbuVRRL4zI8GqNmsrcyqAiP46kERQ+b402RelGsjsRri/VohlxjEFkeFedAdRyqGlw0wsN1z/0gS7RR++ssUsqIdpB6zEZF10UH+Mkdycf2yU37/gW679ytm08hyzpzHEG2IpVVQ66gdmil7DE+wOgHuG0ROJzcOgzpwuAob5IDuZDS6PflFKpumacETL3sUW8kiUiC25M/cT8ivKUYEv3vj1BDq0VlQt+VEqPswiylpYuDsWBeQ2HJ7du4l4AvOw997y28b7qGikZuJEAumdRxyGAV1PCPsH8YzW/OJJFTRoEKADtUh3JankTJja1XKAf/mQKBgQDhHRZ0rGwlIS8FQA1cuJ3qcjMxiyC6oVOK4gJfA+0NzbyCSbKlPNA8k/8UEkYhJijk06xN5uJNnwu3mpq2nL4ksCw2YMb8ffGkX/SGHZyQwg3gvfR2W3snhTZ7PDQtjIrBbjCeqtZYH4sm9B2kAitWPUK3ml9CaG7LhTEwh0fdhwKBgQCbDHnVXM1adnhcSzvv7qXxaQZBr54XHlLmnlUcOun6Vo+9LI/sALSW5hNpQMAflSYlQ1oX1cbhTuwokfrEDyFNLk4rxLdWF5MUsO0o1SLlKeDfHOmDOlJqAl3c87O4QSVTV72kWea6IHf3rHUqER/6wNMs2kN7XN7nNG+vTLD+nQKBgG4hSuEdkXLAvz40TdU0xJzz7bOpOwPS9QoW884EH68HHdgnsexAyic4yCvLnN+OyabZH4ylDcWnr5XNXy9Dk4pjXd3kjrTr8JHYF8qdJgFzzlJK3BQjQSbedv7nPyehgCiNfd/B+Eb4d51BBFc+cHEqWz9zmHLmoH2U1bHGHRR1AoGAey5fQO7Yy00h9JllBgsA1ZnN+bOvkshproUOMz5vE49f5TiZIzOwRc6Gj3F88dqKEsK+uf8CYZBVOSo5IziuCWaHfmhsC77xAFhMIsuqTIyH9lo+/x3/ye8VaWxIVVOUdvFXXlJ6Z1dSWHgwIXq3gH1fiNvjDwhKoz9al9gDKlUCgYBNDv7LvWjcEAeiiiNqy9zAqLUifPSIvTENHWzLTbwpFyIVWHmDpC5lWFap5cz2AGRwIuYK7RBIz3GDjjy897R9q/nZ5hU8vOMSS15Bp1r+7iG6QradzlFRUMiYup2CLY5mL5qz+jY0yNzi9vx7oe7lj68yPBmVBFi9M5IztujbGQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5IuP696hu7oT4vyIt0uI1Y3LVSDY4PVkruMrqLXRlju43wFCIb4V/hoKZDMeqj7YXFGfFat3IORzTTGy3/0zmHsmgWIL1K2NQiEp1JnruwSpwncUJNcYed4ruDPXTJiumI0Zh3ivz3W6tlxYMCB5DW1/poP+b+fXXPfzhXoaYlUKYzpH8F88v2etSAFSc6zwdhkiovXARKbASBhbog+rpNk9m7uYHRHgeaXZ/E6WC9F7IsUlVZs3w7unHXOzRzAz9WGOHXzluAOD5mv4N6w1TOhLYf71KoT9Z3Y+3eT6sgeivYTsLFl1wJF9pVFC9bMqfy5tVzTlDVKp6QYuttbLUwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://192.168.0.34:8888/zhifubao/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://192.168.0.34:8888/zhifubao/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

