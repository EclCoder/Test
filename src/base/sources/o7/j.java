package o7;

import android.text.TextUtils;
import bm.o;
import com.facebook.h0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f48259a = new j();

    private j() {
    }

    public static final File a() {
        if (x7.a.c(j.class)) {
            return null;
        }
        try {
            File file = new File(h0.m().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, j.class);
            return null;
        }
    }

    public static final Map c(File file) {
        Map map;
        Map map2 = null;
        if (x7.a.c(j.class)) {
            return null;
        }
        try {
            s.h(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i10 = byteBufferWrap.getInt();
                int i11 = i10 + 4;
                if (iAvailable < i11) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i10, bm.d.f9079b));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i12 = 0; i12 < length; i12++) {
                    strArr[i12] = jSONArrayNames.getString(i12);
                }
                gl.j.E(strArr);
                HashMap map3 = new HashMap();
                int i13 = 0;
                while (i13 < length) {
                    String str = strArr[i13];
                    if (str == null) {
                        map = map2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i14 = 1;
                        map = map2;
                        for (int i15 = 0; i15 < length2; i15++) {
                            try {
                                int i16 = jSONArray.getInt(i15);
                                iArr[i15] = i16;
                                i14 *= i16;
                            } catch (Exception unused) {
                                return map;
                            } catch (Throwable th2) {
                                th = th2;
                                x7.a.b(th, j.class);
                                return map;
                            }
                        }
                        int i17 = i14 * 4;
                        int i18 = i11 + i17;
                        if (i18 > iAvailable) {
                            return map;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i11, i17);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        byteBufferWrap2.asFloatBuffer().get(aVar.a(), 0, i14);
                        map3.put(str, aVar);
                        i11 = i18;
                    }
                    i13++;
                    map2 = map;
                }
                return map3;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = map2;
        }
    }

    public final String b(String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = s.i(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new o("\\s+").j(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]));
            s.g(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final int[] d(String texts, int i10) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(texts, "texts");
            int[] iArr = new int[i10];
            String strB = b(texts);
            Charset charsetForName = Charset.forName(C.UTF8_NAME);
            s.g(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strB.getBytes(charsetForName);
            s.g(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 < bytes.length) {
                    iArr[i11] = bytes[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                } else {
                    iArr[i11] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }
}
