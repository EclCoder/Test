package b3;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sc.e;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends x2.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f8306c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f8307a = e.f52294c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f8308b = e.f52293b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f8307a.decode(byteBuffer).toString();
            this.f8307a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f8307a.reset();
            byteBuffer.rewind();
            try {
                return this.f8308b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f8308b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f8307a.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }

    @Override // x2.c
    protected u b(x2.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new u(new c(bArr, null, null));
        }
        Matcher matcher = f8306c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = sc.c.e(strGroup);
                strE.getClass();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new u(new c(bArr, str, str2));
    }
}
