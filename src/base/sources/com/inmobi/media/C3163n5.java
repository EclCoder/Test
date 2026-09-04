package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.C3163n5;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3163n5 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f27033b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3163n5(Context context, byte b10, InterfaceC3322t9 interfaceC3322t9) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        this.f27032a = b10;
        this.f27033b = interfaceC3322t9;
        int i10 = b10 == 0 ? 15 : (b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5 || b10 == 6) ? 30 : 0;
        try {
            Integer numA = a(b10);
            try {
                if (numA == null) {
                    if (interfaceC3322t9 != null) {
                        ((C3348u9) interfaceC3322t9).b("CustomView", "null drawable id while creating button - " + ((int) b10));
                        return;
                    }
                    return;
                }
                a(numA.intValue(), i10, i10, i10, i10);
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).c("CustomView", "new customView - " + ((int) b10) + " created");
                    return;
                }
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        InterfaceC3322t9 interfaceC3322t10 = this.f27033b;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("CustomView", "exception while building customView", exc);
        }
        fl.k kVar = W9.f25935a;
        AbstractC3219p9.a(exc);
    }

    public static Integer a(byte b10) {
        if (b10 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b10 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b10 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b10 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b10 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b10 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b10 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b10 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b10 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    public final void a(int i10, final int i11, final int i12, final int i13, final int i14) {
        B5.f24500a.getClass();
        if (!B5.y()) {
            em.k.d(H9.f24931d, null, null, new C3137m5(this, i10, i11, i12, i13, i14, null), 3, null);
        } else {
            Icon.createWithResource(getContext(), i10).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: yh.t9
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C3163n5.a(this.f57941a, i11, i12, i13, i14, drawable);
                }
            }, ((ExecutorC2937ec) AbstractC3293s6.f27440e.getValue()).f26488a);
        }
    }

    public static final void a(C3163n5 c3163n5, int i10, int i11, int i12, int i13, Drawable drawable) {
        if (drawable == null) {
            InterfaceC3322t9 interfaceC3322t9 = c3163n5.f27033b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("CustomView", "drawable for " + ((int) c3163n5.f27032a) + " is null");
                return;
            }
            return;
        }
        c3163n5.setImageDrawable(drawable);
        c3163n5.setPadding(i10, i11, i12, i13);
    }

    public final void a(final Drawable drawable, final int i10, final int i11, final int i12, final int i13) {
        post(new Runnable() { // from class: yh.u9
            @Override // java.lang.Runnable
            public final void run() {
                C3163n5.a(this.f57957a, drawable, i10, i11, i12, i13);
            }
        });
    }

    public static final void a(C3163n5 c3163n5, Drawable drawable, int i10, int i11, int i12, int i13) {
        c3163n5.setImageDrawable(drawable);
        c3163n5.setPadding(i10, i11, i12, i13);
    }
}
