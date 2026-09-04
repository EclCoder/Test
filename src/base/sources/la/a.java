package la;

import ha.d;
import ha.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f44066c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f44067a = e.f52294c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f44068b = e.f52293b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f44067a.decode(byteBuffer).toString();
            this.f44067a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f44067a.reset();
            byteBuffer.rewind();
            try {
                return this.f44068b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f44068b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f44067a.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }

    @Override // ha.g
    protected ha.a b(d dVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new ha.a(new c(bArr, null, null));
        }
        Matcher matcher = f44066c.matcher(strC);
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
        return new ha.a(new c(bArr, str, str2));
    }
}
