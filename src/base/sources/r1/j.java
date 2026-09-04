package r1;

import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f51008a = new j();

    private j() {
    }

    public final s1.c a(Collection initializers) {
        s.h(initializers, "initializers");
        q1.f[] fVarArr = (q1.f[]) initializers.toArray(new q1.f[0]);
        return new q1.b((q1.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public final p1 b(zl.c modelClass, q1.a extras, q1.f... initializers) {
        p1 p1Var;
        q1.f fVar;
        Function1 function1B;
        s.h(modelClass, "modelClass");
        s.h(extras, "extras");
        s.h(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            p1Var = null;
            if (i10 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i10];
            if (s.c(fVar.a(), modelClass)) {
                break;
            }
            i10++;
        }
        if (fVar != null && (function1B = fVar.b()) != null) {
            p1Var = (p1) function1B.invoke(extras);
        }
        if (p1Var != null) {
            return p1Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a.a(modelClass)).toString());
    }

    public final String c(zl.c modelClass) {
        s.h(modelClass, "modelClass");
        String strA = a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final p1 d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
