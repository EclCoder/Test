package um;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f54809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f54810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f54811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f54812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char f54814f;

    public r(InputStream inputStream, Charset charset) {
        kotlin.jvm.internal.s.h(inputStream, "inputStream");
        kotlin.jvm.internal.s.h(charset, "charset");
        this.f54809a = inputStream;
        this.f54810b = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f54811c = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(l.f54788c.d());
        this.f54812d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    private final int a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f54811c.decode(this.f54812d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (b() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f54812d.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.f54811c.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f54811c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int b() {
        this.f54812d.compact();
        try {
            int iLimit = this.f54812d.limit();
            int iPosition = this.f54812d.position();
            int i10 = this.f54809a.read(this.f54812d.array(), this.f54812d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            ByteBuffer byteBuffer = this.f54812d;
            kotlin.jvm.internal.s.f(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            return this.f54812d.remaining();
        } finally {
            this.f54812d.flip();
        }
    }

    private final int c() {
        if (this.f54813e) {
            this.f54813e = false;
            return this.f54814f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f54814f = cArr[1];
            this.f54813e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(char[] array, int i10, int i11) {
        kotlin.jvm.internal.s.h(array, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= array.length || i11 < 0 || i10 + i11 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + array.length).toString());
        }
        if (this.f54813e) {
            array[i10] = this.f54814f;
            i10++;
            i11--;
            this.f54813e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(array, i10, i11) + i12;
        }
        int iC = c();
        if (iC != -1) {
            array[i10] = (char) iC;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void e() {
        l lVar = l.f54788c;
        byte[] bArrArray = this.f54812d.array();
        kotlin.jvm.internal.s.g(bArrArray, "array(...)");
        lVar.c(bArrArray);
    }
}
