package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bm.r;
import com.facebook.internal.i0;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.facebook.internal.r0;
import com.facebook.login.n0;
import com.facebook.login.o0;
import com.facebook.login.t0;
import com.facebook.s0;
import com.facebook.v0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 g2\u00020\u0001:\u0002>AB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0003¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0003¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000fH\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b*\u0010\u0019J\u001f\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010.J7\u00104\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000206H\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\nH\u0014¢\u0006\u0004\b<\u0010\fR\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010ER\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010LR.\u0010T\u001a\u0004\u0018\u00010\u001c2\b\u0010N\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR*\u0010V\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u0010\u0014\"\u0004\bW\u0010\u0012R*\u0010\\\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010B\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010f\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u0014\"\u0004\be\u0010\u0012¨\u0006h"}, d2 = {"Lcom/facebook/login/widget/ProfilePictureView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lfl/g0;", "e", "()V", "g", "(Landroid/util/AttributeSet;)V", "", "force", "i", "(Z)V", "f", "()Z", "l", "Landroid/graphics/Bitmap;", "imageBitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "allowCachedResponse", "j", "", "accessToken", "Landroid/net/Uri;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Ljava/lang/String;)Landroid/net/Uri;", "Lcom/facebook/internal/k0;", "response", "h", "(Lcom/facebook/internal/k0;)V", "m", "forcePreset", "c", "(Z)I", "inputBitmap", "setDefaultProfilePicture", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "(ZIIII)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onDetachedFromWindow", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "image", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "queryHeight", "queryWidth", "Landroid/graphics/Bitmap;", "imageContents", "Lcom/facebook/internal/j0;", "Lcom/facebook/internal/j0;", "lastRequest", "customizedDefaultProfilePicture", "Lcom/facebook/v0;", "Lcom/facebook/v0;", "profileTracker", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "getProfileId", "()Ljava/lang/String;", "setProfileId", "(Ljava/lang/String;)V", "profileId", "Z", "isCropped", "setCropped", "getPresetSize", "()I", "setPresetSize", "(I)V", "presetSize", "Lcom/facebook/login/widget/ProfilePictureView$b;", "onErrorListener", "Lcom/facebook/login/widget/ProfilePictureView$b;", "getOnErrorListener", "()Lcom/facebook/login/widget/ProfilePictureView$b;", "setOnErrorListener", "(Lcom/facebook/login/widget/ProfilePictureView$b;)V", "getShouldUpdateOnProfileChange", "setShouldUpdateOnProfileChange", "shouldUpdateOnProfileChange", CampaignEx.JSON_KEY_AD_K, "facebook-login_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProfilePictureView extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f15875l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageView image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int queryHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int queryWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bitmap imageContents;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j0 lastRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Bitmap customizedDefaultProfilePicture;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private v0 profileTracker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String profileId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isCropped;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int presetSize;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends v0 {
        c() {
        }

        @Override // com.facebook.v0
        protected void c(s0 s0Var, s0 s0Var2) {
            ProfilePictureView.this.setProfileId(s0Var2 != null ? s0Var2.b() : null);
            ProfilePictureView.this.i(true);
        }
    }

    static {
        String simpleName = ProfilePictureView.class.getSimpleName();
        s.g(simpleName, "ProfilePictureView::class.java.simpleName");
        f15875l = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        s.h(context, "context");
        s.h(attrs, "attrs");
        this.image = new ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        e();
        g(attrs);
    }

    private final int c(boolean forcePreset) {
        int i10;
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            int i11 = this.presetSize;
            if (i11 == -1 && !forcePreset) {
                return 0;
            }
            if (i11 == -4) {
                i10 = n0.f15671a;
            } else if (i11 == -3) {
                i10 = n0.f15672b;
            } else if (i11 == -2) {
                i10 = n0.f15673c;
            } else {
                if (i11 != -1) {
                    return 0;
                }
                i10 = n0.f15672b;
            }
            return getResources().getDimensionPixelSize(i10);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    private final Uri d(String accessToken) {
        s0 s0VarB = s0.f16003h.b();
        return (s0VarB == null || !com.facebook.a.f14853l.h()) ? j0.f15248f.a(this.profileId, this.queryWidth, this.queryHeight, accessToken) : s0VarB.e(this.queryWidth, this.queryHeight);
    }

    private final void e() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            removeAllViews();
            this.image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.image);
            this.profileTracker = new c();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final boolean f() {
        return this.queryWidth == 0 && this.queryHeight == 0;
    }

    private final void g(AttributeSet attrs) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, t0.f15723d0);
            s.g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ook_profile_picture_view)");
            setPresetSize(typedArrayObtainStyledAttributes.getInt(t0.f15727f0, -1));
            setCropped(typedArrayObtainStyledAttributes.getBoolean(t0.f15725e0, true));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void h(k0 response) {
        if (x7.a.c(this) || response == null) {
            return;
        }
        try {
            if (s.c(response.c(), this.lastRequest)) {
                this.lastRequest = null;
                Bitmap bitmapA = response.a();
                Exception excB = response.b();
                if (excB != null) {
                    r0.f15352e.a(com.facebook.r0.REQUESTS, 6, f15875l, excB.toString());
                } else if (bitmapA != null) {
                    setImageBitmap(bitmapA);
                    if (response.d()) {
                        j(false);
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean force) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            boolean zM = m();
            String str = this.profileId;
            if (str != null && str.length() != 0 && !f()) {
                if (!zM && !force) {
                    return;
                }
                j(true);
                return;
            }
            l();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void j(boolean allowCachedResponse) {
        com.facebook.a aVarE;
        String strP;
        if (x7.a.c(this)) {
            return;
        }
        try {
            com.facebook.a.c cVar = com.facebook.a.f14853l;
            String str = "";
            if (cVar.g() && (aVarE = cVar.e()) != null && (strP = aVarE.p()) != null) {
                str = strP;
            }
            Uri uriD = d(str);
            Context context = getContext();
            s.g(context, "context");
            j0 j0VarA = new j0.a(context, uriD).b(allowCachedResponse).d(this).c(new j0.b() { // from class: com.facebook.login.widget.e
                @Override // com.facebook.internal.j0.b
                public final void a(k0 k0Var) {
                    ProfilePictureView.k(this.f15892a, k0Var);
                }
            }).a();
            j0 j0Var = this.lastRequest;
            if (j0Var != null) {
                i0.d(j0Var);
            }
            this.lastRequest = j0VarA;
            i0.f(j0VarA);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ProfilePictureView this$0, k0 k0Var) {
        s.h(this$0, "this$0");
        this$0.h(k0Var);
    }

    private final void l() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            j0 j0Var = this.lastRequest;
            if (j0Var != null) {
                i0.d(j0Var);
            }
            Bitmap bitmap = this.customizedDefaultProfilePicture;
            if (bitmap == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.isCropped ? o0.f15679b : o0.f15678a));
                return;
            }
            m();
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.queryWidth, this.queryHeight, false);
            s.g(bitmapCreateScaledBitmap, "createScaledBitmap(custo…idth, queryHeight, false)");
            setImageBitmap(bitmapCreateScaledBitmap);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final boolean m() {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z10 = true;
            if (width >= 1 && height >= 1) {
                int iC = c(false);
                if (iC != 0) {
                    height = iC;
                    width = height;
                }
                if (width <= height) {
                    height = this.isCropped ? width : 0;
                } else {
                    width = this.isCropped ? height : 0;
                }
                if (width == this.queryWidth && height == this.queryHeight) {
                    z10 = false;
                }
                this.queryWidth = width;
                this.queryHeight = height;
                return z10;
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final void setImageBitmap(Bitmap imageBitmap) {
        if (x7.a.c(this) || imageBitmap == null) {
            return;
        }
        try {
            this.imageContents = imageBitmap;
            this.image.setImageBitmap(imageBitmap);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final b getOnErrorListener() {
        return null;
    }

    public final int getPresetSize() {
        return this.presetSize;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        v0 v0Var = this.profileTracker;
        if (v0Var != null) {
            return v0Var.b();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastRequest = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        i(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        boolean z11 = true;
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 || layoutParams.height != -2) {
            z10 = false;
        } else {
            size = c(true);
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z10 = true;
        }
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 || layoutParams.width != -2) {
            z11 = z10;
        } else {
            size2 = c(true);
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z11) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        s.h(state, "state");
        if (!s.c(state.getClass(), Bundle.class)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        setProfileId(bundle.getString("ProfilePictureView_profileId"));
        setPresetSize(bundle.getInt("ProfilePictureView_presetSize"));
        setCropped(bundle.getBoolean("ProfilePictureView_isCropped"));
        this.queryWidth = bundle.getInt("ProfilePictureView_width");
        this.queryHeight = bundle.getInt("ProfilePictureView_height");
        i(true);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelableOnSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.profileId);
        bundle.putInt("ProfilePictureView_presetSize", this.presetSize);
        bundle.putBoolean("ProfilePictureView_isCropped", this.isCropped);
        bundle.putInt("ProfilePictureView_width", this.queryWidth);
        bundle.putInt("ProfilePictureView_height", this.queryHeight);
        bundle.putBoolean("ProfilePictureView_refresh", this.lastRequest != null);
        return bundle;
    }

    public final void setCropped(boolean z10) {
        this.isCropped = z10;
        i(false);
    }

    public final void setDefaultProfilePicture(Bitmap inputBitmap) {
        this.customizedDefaultProfilePicture = inputBitmap;
    }

    public final void setPresetSize(int i10) {
        if (i10 != -4 && i10 != -3 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.presetSize = i10;
        requestLayout();
    }

    public final void setProfileId(String str) {
        String str2 = this.profileId;
        boolean z10 = true;
        if (str2 == null || str2.length() == 0 || !r.A(this.profileId, str, true)) {
            l();
        } else {
            z10 = false;
        }
        this.profileId = str;
        i(z10);
    }

    public final void setShouldUpdateOnProfileChange(boolean z10) {
        if (z10) {
            v0 v0Var = this.profileTracker;
            if (v0Var != null) {
                v0Var.d();
                return;
            }
            return;
        }
        v0 v0Var2 = this.profileTracker;
        if (v0Var2 != null) {
            v0Var2.e();
        }
    }

    public final void setOnErrorListener(b bVar) {
    }
}
