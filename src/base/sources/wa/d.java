package wa;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.h0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ob.n0;
import ob.y;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f56024d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f56026c;

    public d() {
        this(0, true);
    }

    private static void b(int i10, List list) {
        if (com.google.common.primitives.g.j(f56024d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    private u9.k d(int i10, v0 v0Var, List list, n0 n0Var) {
        if (i10 == 0) {
            return new ea.b();
        }
        if (i10 == 1) {
            return new ea.e();
        }
        if (i10 == 2) {
            return new ea.h();
        }
        if (i10 == 7) {
            return new ba.f(0, 0L);
        }
        if (i10 == 8) {
            return e(n0Var, v0Var, list);
        }
        if (i10 == 11) {
            return f(this.f56025b, this.f56026c, v0Var, list, n0Var);
        }
        if (i10 != 13) {
            return null;
        }
        return new s(v0Var.f18859c, n0Var);
    }

    private static ca.g e(n0 n0Var, v0 v0Var, List list) {
        int i10 = g(v0Var) ? 4 : 0;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new ca.g(i10, n0Var, null, list);
    }

    private static h0 f(int i10, boolean z10, v0 v0Var, List list, n0 n0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 = i10 | 48;
        } else {
            list = z10 ? Collections.singletonList(new v0.b().g0(MimeTypes.APPLICATION_CEA608).G()) : Collections.EMPTY_LIST;
        }
        String str = v0Var.f18865i;
        if (!TextUtils.isEmpty(str)) {
            if (!y.b(str, MimeTypes.AUDIO_AAC)) {
                i11 |= 2;
            }
            if (!y.b(str, MimeTypes.VIDEO_H264)) {
                i11 |= 4;
            }
        }
        return new h0(2, n0Var, new ea.j(i11, list));
    }

    private static boolean g(v0 v0Var) {
        ha.a aVar = v0Var.f18866j;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.f(); i10++) {
            ha.a.b bVarE = aVar.e(i10);
            if (bVarE instanceof q) {
                return !((q) bVarE).f56148c.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(u9.k kVar, u9.l lVar) {
        try {
            return kVar.d(lVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            lVar.resetPeekPosition();
        }
    }

    @Override // wa.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b a(Uri uri, v0 v0Var, List list, n0 n0Var, Map map, u9.l lVar, s1 s1Var) {
        int iA = ob.n.a(v0Var.f18868l);
        int iB = ob.n.b(map);
        int iC = ob.n.c(uri);
        int[] iArr = f56024d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(iA, arrayList);
        b(iB, arrayList);
        b(iC, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        lVar.resetPeekPosition();
        u9.k kVar = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            u9.k kVar2 = (u9.k) ob.a.e(d(iIntValue, v0Var, list, n0Var));
            if (h(kVar2, lVar)) {
                return new b(kVar2, v0Var, n0Var);
            }
            if (kVar == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                kVar = kVar2;
            }
        }
        return new b((u9.k) ob.a.e(kVar), v0Var, n0Var);
    }

    public d(int i10, boolean z10) {
        this.f56025b = i10;
        this.f56026c = z10;
    }
}
