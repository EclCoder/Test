package yn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import xn.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final void a(xn.l lVar, h0 dir, boolean z10) {
        kotlin.jvm.internal.s.h(lVar, "<this>");
        kotlin.jvm.internal.s.h(dir, "dir");
        gl.i iVar = new gl.i();
        for (h0 h0VarG = dir; h0VarG != null && !lVar.q(h0VarG); h0VarG = h0VarG.g()) {
            iVar.addFirst(h0VarG);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            xn.l.k(lVar, (h0) it.next(), false, 2, null);
        }
    }

    public static final boolean b(xn.l lVar, h0 path) {
        kotlin.jvm.internal.s.h(lVar, "<this>");
        kotlin.jvm.internal.s.h(path, "path");
        return lVar.t(path) != null;
    }

    public static final xn.k c(xn.l lVar, h0 path) throws FileNotFoundException {
        kotlin.jvm.internal.s.h(lVar, "<this>");
        kotlin.jvm.internal.s.h(path, "path");
        xn.k kVarT = lVar.t(path);
        if (kVarT != null) {
            return kVarT;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
