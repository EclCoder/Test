package l1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float[] f43784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Matrix f43785b;

        a(float[] fArr, Matrix matrix) {
            this.f43784a = fArr;
            this.f43785b = matrix;
        }

        @Override // l1.q
        public final long a(float f10, float f11) {
            float[] fArr = this.f43784a;
            fArr[0] = f10;
            fArr[1] = f11;
            this.f43785b.mapPoints(fArr);
            float[] fArr2 = this.f43784a;
            return androidx.collection.g.b(fArr2[0], fArr2[1]);
        }
    }

    private static final void a(Path path, List list) {
        path.rewind();
        int size = list.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) list.get(i10);
            if (z10) {
                path.moveTo(dVar.b(), dVar.c());
                z10 = false;
            }
            path.cubicTo(dVar.f(), dVar.g(), dVar.h(), dVar.i(), dVar.d(), dVar.e());
        }
        path.close();
    }

    public static final Path b(m mVar, float f10, Path path) {
        kotlin.jvm.internal.s.h(mVar, "<this>");
        kotlin.jvm.internal.s.h(path, "path");
        a(path, mVar.a(f10));
        return path;
    }

    public static final u c(u uVar, Matrix matrix) {
        kotlin.jvm.internal.s.h(uVar, "<this>");
        kotlin.jvm.internal.s.h(matrix, "matrix");
        return uVar.h(new a(new float[2], matrix));
    }
}
