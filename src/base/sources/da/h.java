package da;

import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import ob.d0;
import q9.v;
import u9.e0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f36524o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f36525p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36526n;

    h() {
    }

    private static boolean n(d0 d0Var, byte[] bArr) {
        if (d0Var.a() < bArr.length) {
            return false;
        }
        int iF = d0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        d0Var.l(bArr2, 0, bArr.length);
        d0Var.U(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(d0 d0Var) {
        return n(d0Var, f36524o);
    }

    @Override // da.i
    protected long f(d0 d0Var) {
        return c(v.e(d0Var.e()));
    }

    @Override // da.i
    protected boolean h(d0 d0Var, long j10, i.b bVar) {
        if (n(d0Var, f36524o)) {
            byte[] bArrCopyOf = Arrays.copyOf(d0Var.e(), d0Var.g());
            int iC = v.c(bArrCopyOf);
            List listA = v.a(bArrCopyOf);
            if (bVar.f36540a != null) {
                return true;
            }
            bVar.f36540a = new v0.b().g0(MimeTypes.AUDIO_OPUS).J(iC).h0(48000).V(listA).G();
            return true;
        }
        byte[] bArr = f36525p;
        if (!n(d0Var, bArr)) {
            ob.a.i(bVar.f36540a);
            return false;
        }
        ob.a.i(bVar.f36540a);
        if (this.f36526n) {
            return true;
        }
        this.f36526n = true;
        d0Var.V(bArr.length);
        ha.a aVarC = e0.c(c0.z(e0.i(d0Var, false, false).f54269b));
        if (aVarC == null) {
            return true;
        }
        bVar.f36540a = bVar.f36540a.b().Z(aVarC.b(bVar.f36540a.f18866j)).G();
        return true;
    }

    @Override // da.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f36526n = false;
        }
    }
}
