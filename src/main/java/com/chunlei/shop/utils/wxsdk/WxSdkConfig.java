package com.chunlei.shop.utils.wxsdk;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Created by lcl on 2019/9/2 0002
 */
public class WxSdkConfig extends WXPayConfig{
    private final static String CERT_PATH="/data/work/apiclient_cert.p12";
    private final static String APP_ID="wx8888888888888888";
    private final static String MCH_ID="12888888";
    private final static String WX_KEY="88888888888888888888888888888888";

    private byte[] certData;
    private static volatile WxSdkConfig wxSdkConfig;

    public static WxSdkConfig getSingleSdk() throws Exception {
        if (wxSdkConfig == null) {
            synchronized (WxSdkConfig.class) {
                // 只需在第一次创建实例时才同步
                if (wxSdkConfig == null) {
                    wxSdkConfig = new WxSdkConfig(CERT_PATH);
                }
            }
        }
        return wxSdkConfig;
    }

    public WxSdkConfig(String certPath) throws Exception {
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public String getAppID() {
        return APP_ID;
    }

    public String getMchID() {
        return MCH_ID;
    }

    public String getKey() {
        return WX_KEY;
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        IWXPayDomain iwxPayDomain = new IWXPayDomain() {
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API, true);
            }
        };
        return iwxPayDomain;
    }

}
