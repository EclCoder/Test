package lo;

import co.j;
import co.u;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.http.UrlEncodedParser;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.m;
import org.apache.http.message.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BitSet f44888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BitSet f44889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BitSet f44890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BitSet f44891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BitSet f44892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BitSet f44893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BitSet f44894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BitSet f44895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BitSet f44896i;

    static {
        BitSet bitSet = new BitSet(256);
        f44888a = bitSet;
        bitSet.set(47);
        f44889b = new BitSet(256);
        f44890c = new BitSet(256);
        f44891d = new BitSet(256);
        f44892e = new BitSet(256);
        f44893f = new BitSet(256);
        f44894g = new BitSet(256);
        f44895h = new BitSet(256);
        f44896i = new BitSet(256);
        for (int i10 = 97; i10 <= 122; i10++) {
            f44889b.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f44889b.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f44889b.set(i12);
        }
        BitSet bitSet2 = f44889b;
        bitSet2.set(95);
        bitSet2.set(45);
        bitSet2.set(46);
        bitSet2.set(42);
        f44895h.or(bitSet2);
        bitSet2.set(33);
        bitSet2.set(Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        bitSet2.set(39);
        bitSet2.set(40);
        bitSet2.set(41);
        BitSet bitSet3 = f44890c;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        BitSet bitSet4 = f44891d;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        BitSet bitSet5 = f44892e;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        BitSet bitSet6 = f44896i;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        BitSet bitSet7 = f44894g;
        bitSet7.set(59);
        bitSet7.set(47);
        bitSet7.set(63);
        bitSet7.set(58);
        bitSet7.set(64);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        bitSet7.set(91);
        bitSet7.set(93);
        BitSet bitSet8 = f44893f;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    private static List a() {
        return new ArrayList(0);
    }

    private static String b(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = co.b.f10154a;
        }
        return o(str, charset, true);
    }

    static String c(String str, Charset charset) {
        return p(str, charset, f44893f, false);
    }

    static String d(String str, Charset charset) {
        return p(str, charset, f44891d, false);
    }

    private static String e(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = co.b.f10154a;
        }
        return p(str, charset, f44895h, true);
    }

    public static String f(Iterable iterable, char c10, Charset charset) {
        ip.a.h(iterable, "Parameters");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            String strE = e(uVar.getName(), charset);
            String strE2 = e(uVar.getValue(), charset);
            if (sb2.length() > 0) {
                sb2.append(c10);
            }
            sb2.append(strE);
            if (strE2 != null) {
                sb2.append("=");
                sb2.append(strE2);
            }
        }
        return sb2.toString();
    }

    public static String g(Iterable iterable, Charset charset) {
        return f(iterable, '&', charset);
    }

    public static String h(Iterable iterable, Charset charset) {
        ip.a.h(iterable, "Segments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb2.append('/');
            sb2.append(p(str, charset, f44892e, false));
        }
        return sb2.toString();
    }

    public static List i(j jVar) throws IOException {
        ip.a.h(jVar, "HTTP entity");
        org.apache.http.entity.d dVarE = org.apache.http.entity.d.e(jVar);
        if (dVarE == null || !dVarE.h().equalsIgnoreCase(UrlEncodedParser.CONTENT_TYPE)) {
            return a();
        }
        long contentLength = jVar.getContentLength();
        ip.a.a(contentLength <= 2147483647L, "HTTP entity is too large");
        Charset charsetG = dVarE.g() != null ? dVarE.g() : gp.e.f39837a;
        InputStream content = jVar.getContent();
        if (content == null) {
            return a();
        }
        try {
            ip.c cVar = new ip.c(contentLength > 0 ? (int) contentLength : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader(content, charsetG);
            char[] cArr = new char[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    break;
                }
                cVar.c(cArr, 0, i10);
            }
            content.close();
            return cVar.isEmpty() ? a() : j(cVar, charsetG, '&');
        } catch (Throwable th2) {
            content.close();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    public static List j(ip.c cVar, Charset charset, char... cArr) {
        String strF;
        ip.a.h(cVar, "Char array buffer");
        v vVar = v.f49432a;
        BitSet bitSet = new BitSet();
        for (char c10 : cArr) {
            bitSet.set(c10);
        }
        org.apache.http.message.u uVar = new org.apache.http.message.u(0, cVar.length());
        ArrayList arrayList = new ArrayList();
        while (!uVar.a()) {
            bitSet.set(61);
            String strF2 = vVar.f(cVar, uVar, bitSet);
            if (uVar.a()) {
                strF = null;
            } else {
                char cCharAt = cVar.charAt(uVar.b());
                uVar.d(uVar.b() + 1);
                if (cCharAt == '=') {
                    bitSet.clear(61);
                    strF = vVar.f(cVar, uVar, bitSet);
                    if (!uVar.a()) {
                        uVar.d(uVar.b() + 1);
                    }
                } else {
                    strF = null;
                }
            }
            if (!strF2.isEmpty()) {
                arrayList.add(new m(b(strF2, charset), b(strF, charset)));
            }
        }
        return arrayList;
    }

    public static List k(String str, Charset charset) {
        if (str == null) {
            return a();
        }
        ip.c cVar = new ip.c(str.length());
        cVar.b(str);
        return j(cVar, charset, '&', ';');
    }

    public static List l(CharSequence charSequence, Charset charset) {
        ip.a.h(charSequence, "Char sequence");
        List listM = m(charSequence);
        for (int i10 = 0; i10 < listM.size(); i10++) {
            listM.set(i10, o((String) listM.get(i10), charset != null ? charset : co.b.f10154a, false));
        }
        return listM;
    }

    static List m(CharSequence charSequence) {
        return n(charSequence, f44888a);
    }

    static List n(CharSequence charSequence, BitSet bitSet) {
        org.apache.http.message.u uVar = new org.apache.http.message.u(0, charSequence.length());
        if (uVar.a()) {
            return Collections.EMPTY_LIST;
        }
        if (bitSet.get(charSequence.charAt(uVar.b()))) {
            uVar.d(uVar.b() + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        while (!uVar.a()) {
            char cCharAt = charSequence.charAt(uVar.b());
            if (bitSet.get(cCharAt)) {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            } else {
                sb2.append(cCharAt);
            }
            uVar.d(uVar.b() + 1);
        }
        arrayList.add(sb2.toString());
        return arrayList;
    }

    private static String o(String str, Charset charset, boolean z10) {
        if (str == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        while (charBufferWrap.hasRemaining()) {
            char c10 = charBufferWrap.get();
            if (c10 == '%' && charBufferWrap.remaining() >= 2) {
                char c11 = charBufferWrap.get();
                char c12 = charBufferWrap.get();
                int iDigit = Character.digit(c11, 16);
                int iDigit2 = Character.digit(c12, 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    byteBufferAllocate.put((byte) 37);
                    byteBufferAllocate.put((byte) c11);
                    byteBufferAllocate.put((byte) c12);
                } else {
                    byteBufferAllocate.put((byte) ((iDigit << 4) + iDigit2));
                }
            } else if (z10 && c10 == '+') {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put((byte) c10);
            }
        }
        byteBufferAllocate.flip();
        return charset.decode(byteBufferAllocate).toString();
    }

    private static String p(String str, Charset charset, BitSet bitSet, boolean z10) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            byte b10 = byteBufferEncode.get();
            int i10 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (bitSet.get(i10)) {
                sb2.append((char) i10);
            } else if (z10 && i10 == 32) {
                sb2.append('+');
            } else {
                sb2.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i10 >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b10 & 15, 16));
                sb2.append(upperCase);
                sb2.append(upperCase2);
            }
        }
        return sb2.toString();
    }
}
