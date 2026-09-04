package q1;

import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import java.util.Arrays;
import kotlin.jvm.internal.s;
import r1.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f[] f50289b;

    public b(f... initializers) {
        s.h(initializers, "initializers");
        this.f50289b = initializers;
    }

    @Override // androidx.lifecycle.s1.c
    public p1 b(Class modelClass, a extras) {
        s.h(modelClass, "modelClass");
        s.h(extras, "extras");
        j jVar = j.f51008a;
        zl.c cVarC = sl.a.c(modelClass);
        f[] fVarArr = this.f50289b;
        return jVar.b(cVarC, extras, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
