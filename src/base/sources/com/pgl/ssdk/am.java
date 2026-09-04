package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f35319a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f35321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f35324f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f35320b = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35325g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f35326h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35327i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35328j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35329k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35330l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f35331m = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.f35328j >= am.this.f35329k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f35321c = context;
    }

    static /* synthetic */ int c(am amVar) {
        int i10 = amVar.f35328j;
        amVar.f35328j = i10 + 1;
        return i10;
    }

    abstract String a();

    abstract void a(int i10, byte[] bArr);

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f35319a)) {
            f35319a = str;
        }
    }

    private void b() {
        Object obj;
        if (this.f35320b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f35319a)) {
                jSONObject.put("ipv6", f35319a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put("gaid", com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put(TtmlNode.TAG_REGION, an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f35320b.addRequestProperty("cypher", String.valueOf(obj));
            this.f35320b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[Catch: all -> 0x00ca, PHI: r0
      0x00b6: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b3, B:27:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ca, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x0060, B:21:0x007d, B:23:0x0080, B:24:0x0096, B:33:0x00b9, B:32:0x00b6, B:18:0x0058), top: B:48:0x0004 }] */
    public boolean c() {
        InputStream inputStream;
        try {
            String strA = an.a(this.f35321c);
            if (TextUtils.isEmpty(strA)) {
                an.b(this.f35321c);
                HttpURLConnection httpURLConnection = this.f35320b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.f35320b = null;
                }
                return false;
            }
            String strConcat = strA + a();
            if (!strConcat.startsWith("https://") && !strConcat.startsWith("http://")) {
                strConcat = "https://".concat(strConcat);
            }
            URL url = new URL(strConcat);
            if (this.f35330l) {
                this.f35320b = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            } else {
                this.f35320b = (HttpURLConnection) url.openConnection();
            }
            this.f35320b.setConnectTimeout(this.f35327i);
            this.f35320b.setReadTimeout(this.f35327i);
            a(this.f35322d);
            b(this.f35323e);
            byte[] bArr = this.f35324f;
            if (bArr != null && bArr.length > 0) {
                this.f35320b.setDoOutput(true);
                OutputStream outputStream = this.f35320b.getOutputStream();
                outputStream.write(this.f35324f);
                outputStream.flush();
                outputStream.close();
            }
            this.f35320b.connect();
            try {
                this.f35325g = this.f35320b.getResponseCode();
                inputStream = this.f35320b.getInputStream();
                try {
                    this.f35326h = a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            a(this.f35325g, this.f35326h);
            HttpURLConnection httpURLConnection2 = this.f35320b;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.f35320b = null;
            }
            return true;
        } catch (Throwable unused3) {
            HttpURLConnection httpURLConnection3 = this.f35320b;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                this.f35320b = null;
            }
            an.b(this.f35321c);
            return false;
        }
    }

    private void a(int i10) throws ProtocolException {
        String str;
        if (i10 == 1) {
            str = HttpMethods.POST;
        } else if (i10 == 3) {
            str = HttpMethods.PUT;
        } else if (i10 == 4) {
            str = HttpMethods.DELETE;
        } else if (i10 != 5) {
            str = i10 != 6 ? HttpMethods.GET : HttpMethods.TRACE;
        } else {
            str = HttpMethods.HEAD;
        }
        this.f35320b.setRequestMethod(str);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        while (true) {
            int i10 = inputStream.read(bArr, 0, UserVerificationMethods.USER_VERIFY_ALL);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        ar.a(this.f35331m);
    }

    private void b(int i10) {
        String str;
        if (i10 != 1) {
            str = i10 != 2 ? "" : "application/octet-stream";
        } else {
            str = "application/json; charset=utf-8";
        }
        if (!str.isEmpty()) {
            this.f35320b.addRequestProperty("Content-Type", str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f35320b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f35320b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f35320b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f35322d = i10;
        this.f35323e = i11;
        this.f35324f = bArr;
    }
}
