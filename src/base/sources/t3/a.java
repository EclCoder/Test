package t3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import l3.r;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f53075a = new u();

    private static v1.a d(u uVar, int i10) {
        CharSequence charSequenceQ = null;
        v1.a.b bVarO = null;
        while (i10 > 0) {
            w1.a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iP = uVar.p();
            int iP2 = uVar.p();
            int i11 = iP - 8;
            String strH = c0.H(uVar.e(), uVar.f(), i11);
            uVar.U(i11);
            i10 = (i10 - 8) - i11;
            if (iP2 == 1937011815) {
                bVarO = e.o(strH);
            } else if (iP2 == 1885436268) {
                charSequenceQ = e.q(null, strH.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return bVarO != null ? bVarO.o(charSequenceQ).a() : e.l(charSequenceQ);
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, w1.h hVar) {
        this.f53075a.R(bArr, i11 + i10);
        this.f53075a.T(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f53075a.a() > 0) {
            w1.a.b(this.f53075a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iP = this.f53075a.p();
            if (this.f53075a.p() == 1987343459) {
                arrayList.add(d(this.f53075a, iP - 8));
            } else {
                this.f53075a.U(iP - 8);
            }
        }
        hVar.accept(new l3.e(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // l3.r
    public int c() {
        return 2;
    }
}
