package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f28417d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f28418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28420c = 9377;

    public n() {
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f28418a = gVarF;
        if (gVarF == null) {
            this.f28418a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f28419b = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, encodedQuery);
            }
        } catch (Throwable th2) {
            q0.b("SocketSpider", th2.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z10 && !z11) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            if (campaignEx != null) {
                if (z10 && campaignEx.getcUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                if (z11 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.f28418a.M0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th3) {
            q0.b("SocketSpider", th3.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f28379g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f28380h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectB = b(strReplace, campaignEx, z10, z11);
        if (jSONObjectB.length() == 0) {
            aVar.f28380h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString("uri"))) {
            aVar.f28380h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f28420c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.f28419b)) {
            return a(strReplace, jSONObjectB.toString());
        }
        aVar.f28380h = "request url parse error.";
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.click.entity.a a(String str, String str2) {
        OutputStream outputStream;
        int length;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket = null;
        OutputStream outputStream2 = null;
        try {
            Socket socket2 = new Socket(this.f28419b, this.f28420c);
            try {
                socket2.setSoTimeout(15000);
                outputStream2 = socket2.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                byteBufferWrap.put((byte) 2);
                byteBufferWrap.put((byte) 3);
                byteBufferWrap.putShort((short) f28417d.getAndIncrement());
                if (TextUtils.isEmpty(str2)) {
                    byteBufferWrap.putInt(0);
                    outputStream2.write(byteBufferWrap.array());
                    length = 0;
                } else {
                    byte[] bArrA = a(str2);
                    length = bArrA.length;
                    byteBufferWrap.putInt(length);
                    outputStream2.write(byteBufferWrap.array());
                    outputStream2.write(bArrA);
                }
                outputStream2.flush();
                q0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
                InputStream inputStream = socket2.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                byteBufferWrap2.order(byteOrder);
                int i10 = byteBufferWrap2.getInt(4);
                byte b10 = bArr[1];
                boolean z10 = b10 == 3;
                Object[] objArr = b10 == 2;
                q0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i10 + " isGzip : " + z10);
                byte[] bArr2 = new byte[i10];
                new DataInputStream(socket2.getInputStream()).readFully(bArr2);
                if (!z10 && i10 > 2 && ((bArr2[0] << 8) | (bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 8075) {
                    z10 = true;
                }
                if (objArr == true && i10 == 0) {
                    aVar.f28378f = 200;
                    aVar.f28379g = str;
                    aVar.f28377e = 0;
                    try {
                        socket2.close();
                        outputStream2.close();
                        return aVar;
                    } catch (Exception e10) {
                        q0.b("SocketSpider", e10.getMessage());
                        return aVar;
                    }
                }
                if (i10 < 1) {
                    aVar.f28378f = 200;
                    aVar.f28379g = str;
                    aVar.f28377e = 0;
                    try {
                        socket2.close();
                        outputStream2.close();
                        return aVar;
                    } catch (Exception e11) {
                        q0.b("SocketSpider", e11.getMessage());
                        return aVar;
                    }
                }
                try {
                    if (z10) {
                        str3 = a(bArr2);
                    } else {
                        str3 = new String(bArr2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        aVar.f28378f = 200;
                        aVar.f28379g = str;
                        aVar.f28377e = 0;
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("location");
                                if (!TextUtils.isEmpty(strOptString)) {
                                    aVar.f28378f = 302;
                                    aVar.f28373a = strOptString;
                                }
                            }
                        } catch (Throwable th2) {
                            q0.b("SocketSpider", th2.getMessage());
                        }
                        try {
                            socket2.close();
                            outputStream2.close();
                        } catch (Exception e12) {
                            q0.b("SocketSpider", e12.getMessage());
                        }
                    } else {
                        inputStream.close();
                        try {
                            socket2.close();
                            outputStream2.close();
                        } catch (Exception e13) {
                            q0.b("SocketSpider", e13.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    q0.b("SocketSpider", th3.getMessage());
                    aVar.f28380h = th3.getMessage();
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream = outputStream2;
                socket = socket2;
                try {
                    q0.a("SocketSpider", "Socket exception: " + th.getMessage());
                    aVar.f28380h = th.getMessage();
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Exception e14) {
                            q0.b("SocketSpider", e14.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
        }
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, UserVerificationMethods.USER_VERIFY_ALL);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
