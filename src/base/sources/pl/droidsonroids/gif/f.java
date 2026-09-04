package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List f50232a = Arrays.asList("raw", "drawable", "mipmap");

    static void a(int i10, Drawable drawable) {
        if (drawable instanceof pl.droidsonroids.gif.b) {
            ((pl.droidsonroids.gif.b) drawable).h(i10);
        }
    }

    static float b(Resources resources, int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        if (i11 <= 0 || i12 <= 0) {
            return 1.0f;
        }
        return i12 / i11;
    }

    static a c(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new a();
        }
        a aVar = new a(imageView, attributeSet, i10, i11);
        int i12 = aVar.f50236b;
        if (i12 >= 0) {
            a(i12, imageView.getDrawable());
            a(i12, imageView.getBackground());
        }
        return aVar;
    }

    static boolean d(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new pl.droidsonroids.gif.b(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    static boolean e(ImageView imageView, boolean z10, int i10) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f50232a.contains(resources.getResourceTypeName(i10))) {
                    return false;
                }
                pl.droidsonroids.gif.b bVar = new pl.droidsonroids.gif.b(resources, i10);
                if (z10) {
                    imageView.setImageDrawable(bVar);
                    return true;
                }
                imageView.setBackground(bVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f50233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f50234d;

        a(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
            super(imageView, attributeSet, i10, i11);
            this.f50233c = a(imageView, attributeSet, true);
            this.f50234d = a(imageView, attributeSet, false);
        }

        private static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z10 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (f.f50232a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !f.e(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }

        a() {
            this.f50233c = 0;
            this.f50234d = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f50235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f50236b;

        b(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, k.f50246d, i10, i11);
            this.f50235a = typedArrayObtainStyledAttributes.getBoolean(k.f50247e, false);
            this.f50236b = typedArrayObtainStyledAttributes.getInt(k.f50248f, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        b() {
            this.f50235a = false;
            this.f50236b = -1;
        }
    }
}
