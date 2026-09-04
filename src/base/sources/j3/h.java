package j3;

import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import o2.h0;
import o2.r0;
import t1.o;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f41967o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f41968p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41969n;

    h() {
    }

    private static boolean n(u uVar, byte[] bArr) {
        if (uVar.a() < bArr.length) {
            return false;
        }
        int iF = uVar.f();
        byte[] bArr2 = new byte[bArr.length];
        uVar.l(bArr2, 0, bArr.length);
        uVar.T(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(u uVar) {
        return n(uVar, f41967o);
    }

    @Override // j3.i
    protected long f(u uVar) {
        return c(h0.e(uVar.e()));
    }

    @Override // j3.i
    protected boolean i(u uVar, long j10, i.b bVar) {
        if (n(uVar, f41967o)) {
            byte[] bArrCopyOf = Arrays.copyOf(uVar.e(), uVar.g());
            int iC = h0.c(bArrCopyOf);
            List listA = h0.a(bArrCopyOf);
            if (bVar.f41983a != null) {
                return true;
            }
            bVar.f41983a = new o.b().o0(MimeTypes.AUDIO_OPUS).N(iC).p0(48000).b0(listA).K();
            return true;
        }
        byte[] bArr = f41968p;
        if (!n(uVar, bArr)) {
            w1.a.i(bVar.f41983a);
            return false;
        }
        w1.a.i(bVar.f41983a);
        if (this.f41969n) {
            return true;
        }
        this.f41969n = true;
        uVar.U(bArr.length);
        t1.u uVarD = r0.d(c0.z(r0.k(uVar, false, false).f48150b));
        if (uVarD == null) {
            return true;
        }
        bVar.f41983a = bVar.f41983a.a().h0(uVarD.b(bVar.f41983a.f52754k)).K();
        return true;
    }

    @Override // j3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f41969n = false;
        }
    }
}
