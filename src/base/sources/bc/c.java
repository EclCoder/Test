package bc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.z;
import sb.e;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray typedArrayI = z.i(context, null, m.G4, i10, i11, new int[0]);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.J4, context.getResources().getDimensionPixelSize(e.f51729x0));
        int dimensionPixelSize2 = typedArrayI.getDimensionPixelSize(m.K4, context.getResources().getDimensionPixelSize(e.f51731y0));
        int dimensionPixelSize3 = typedArrayI.getDimensionPixelSize(m.I4, context.getResources().getDimensionPixelSize(e.f51727w0));
        int dimensionPixelSize4 = typedArrayI.getDimensionPixelSize(m.H4, context.getResources().getDimensionPixelSize(e.f51725v0));
        typedArrayI.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i12 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i12, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
