package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import m0.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f3335k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f3337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f3339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f3342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f3343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3345j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class a {
        static IconCompat a(Object obj) {
            g.g(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.i(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.g(e(obj));
            }
            if (iD == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3337b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f3336a) {
                case -1:
                    return (Icon) iconCompat.f3337b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3337b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.l(), iconCompat.f3340e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f3337b, iconCompat.f3340e, iconCompat.f3341f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f3337b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.c((Bitmap) iconCompat.f3337b, false)) : b.a((Bitmap) iconCompat.f3337b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.n());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.n());
                        }
                        InputStream inputStreamO = iconCompat.o(context);
                        if (inputStreamO == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.n());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.c(BitmapFactory.decodeStream(inputStreamO), false));
                        } else {
                            iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamO));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f3342g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3343h;
            if (mode != IconCompat.f3335k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3336a = -1;
        this.f3338c = null;
        this.f3339d = null;
        this.f3340e = 0;
        this.f3341f = 0;
        this.f3342g = null;
        this.f3343h = f3335k;
        this.f3344i = null;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    public static IconCompat b(Icon icon) {
        if (a.d(icon) == 2 && a.b(icon) == 0) {
            return null;
        }
        return a.a(icon);
    }

    static Bitmap c(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Uri uri) {
        m0.b.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        m0.b.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3337b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        m0.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3337b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        m0.b.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        m0.b.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3337b = str;
        return iconCompat;
    }

    public static IconCompat i(Resources resources, String str, int i10) {
        m0.b.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3340e = i10;
        if (resources != null) {
            try {
                iconCompat.f3337b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3337b = str;
        }
        iconCompat.f3345j = str;
        return iconCompat;
    }

    private static String t(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap j() {
        int i10 = this.f3336a;
        if (i10 == -1) {
            Object obj = this.f3337b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f3337b;
        }
        if (i10 == 5) {
            return c((Bitmap) this.f3337b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int k() {
        int i10 = this.f3336a;
        if (i10 == -1) {
            return a.b(this.f3337b);
        }
        if (i10 == 2) {
            return this.f3340e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String l() {
        int i10 = this.f3336a;
        if (i10 == -1) {
            return a.c(this.f3337b);
        }
        if (i10 == 2) {
            String str = this.f3345j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3337b).split(":", -1)[0] : this.f3345j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i10 = this.f3336a;
        return i10 == -1 ? a.d(this.f3337b) : i10;
    }

    public Uri n() {
        int i10 = this.f3336a;
        if (i10 == -1) {
            return a.e(this.f3337b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f3337b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream o(Context context) {
        Uri uriN = n();
        String scheme = uriN.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriN);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriN, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f3337b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriN, e11);
            return null;
        }
    }

    public void p() {
        this.f3343h = PorterDuff.Mode.valueOf(this.f3344i);
        switch (this.f3336a) {
            case -1:
                Parcelable parcelable = this.f3339d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f3337b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3339d;
                if (parcelable2 != null) {
                    this.f3337b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3338c;
                this.f3337b = bArr;
                this.f3336a = 3;
                this.f3340e = 0;
                this.f3341f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3338c, Charset.forName(C.UTF16_NAME));
                this.f3337b = str;
                if (this.f3336a == 2 && this.f3345j == null) {
                    this.f3345j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3337b = this.f3338c;
                return;
        }
    }

    public void q(boolean z10) {
        this.f3344i = this.f3343h.name();
        switch (this.f3336a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f3339d = (Parcelable) this.f3337b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f3339d = (Parcelable) this.f3337b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f3337b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f3338c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f3338c = ((String) this.f3337b).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.f3338c = (byte[]) this.f3337b;
                return;
            case 4:
            case 6:
                this.f3338c = this.f3337b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
        }
    }

    public Icon r() {
        return s(null);
    }

    public Icon s(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f3336a == -1) {
            return String.valueOf(this.f3337b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(t(this.f3336a));
        switch (this.f3336a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3337b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3337b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3345j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(k())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3340e);
                if (this.f3341f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3341f);
                }
                break;
            case 4:
            case 6:
                sb2.append(PAFNPq.BPyMUv);
                sb2.append(this.f3337b);
                break;
        }
        if (this.f3342g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3342g);
        }
        if (this.f3343h != f3335k) {
            sb2.append(" mode=");
            sb2.append(this.f3343h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f3338c = null;
        this.f3339d = null;
        this.f3340e = 0;
        this.f3341f = 0;
        this.f3342g = null;
        this.f3343h = f3335k;
        this.f3344i = null;
        this.f3336a = i10;
    }
}
