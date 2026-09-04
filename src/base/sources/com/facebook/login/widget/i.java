package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.o0;
import com.facebook.login.p0;
import com.facebook.login.q0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15896i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f15898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f15900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PopupWindow f15901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f15902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f15904h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImageView f15905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImageView f15906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f15907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ImageView f15908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f15909e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, Context context) {
            super(context);
            s.h(context, "context");
            this.f15909e = iVar;
            LayoutInflater.from(context).inflate(q0.f15695a, this);
            View viewFindViewById = findViewById(p0.f15694e);
            s.f(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f15905a = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(p0.f15692c);
            s.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f15906b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(p0.f15690a);
            s.g(viewFindViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.f15907c = viewFindViewById3;
            View viewFindViewById4 = findViewById(p0.f15691b);
            s.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f15908d = (ImageView) viewFindViewById4;
        }

        public final View a() {
            return this.f15907c;
        }

        public final ImageView b() {
            return this.f15906b;
        }

        public final ImageView c() {
            return this.f15905a;
        }

        public final ImageView d() {
            return this.f15908d;
        }

        public final void e() {
            this.f15905a.setVisibility(4);
            this.f15906b.setVisibility(0);
        }

        public final void f() {
            this.f15905a.setVisibility(0);
            this.f15906b.setVisibility(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        BLUE,
        BLACK
    }

    public i(String text, View anchor) {
        s.h(text, "text");
        s.h(anchor, "anchor");
        this.f15897a = text;
        this.f15898b = new WeakReference(anchor);
        Context context = anchor.getContext();
        s.g(context, "anchor.context");
        this.f15899c = context;
        this.f15902f = c.BLUE;
        this.f15903g = 6000L;
        this.f15904h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.f
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                i.f(this.f15893a);
            }
        };
    }

    private final void e() {
        ViewTreeObserver viewTreeObserver;
        if (x7.a.c(this)) {
            return;
        }
        try {
            l();
            View view = (View) this.f15898b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(this.f15904h);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(i this$0) {
        PopupWindow popupWindow;
        if (x7.a.c(i.class)) {
            return;
        }
        try {
            s.h(this$0, "this$0");
            if (this$0.f15898b.get() == null || (popupWindow = this$0.f15901e) == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                b bVar = this$0.f15900d;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            }
            b bVar2 = this$0.f15900d;
            if (bVar2 != null) {
                bVar2.f();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(i this$0) {
        if (x7.a.c(i.class)) {
            return;
        }
        try {
            s.h(this$0, "this$0");
            this$0.d();
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(i this$0, View view) {
        if (x7.a.c(i.class)) {
            return;
        }
        try {
            s.h(this$0, "this$0");
            this$0.d();
        } catch (Throwable th2) {
            x7.a.b(th2, i.class);
        }
    }

    private final void l() {
        ViewTreeObserver viewTreeObserver;
        if (x7.a.c(this)) {
            return;
        }
        try {
            View view = (View) this.f15898b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this.f15904h);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void m() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f15901e;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                b bVar = this.f15900d;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            }
            b bVar2 = this.f15900d;
            if (bVar2 != null) {
                bVar2.f();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void d() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            l();
            PopupWindow popupWindow = this.f15901e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void g(long j10) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            this.f15903g = j10;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void h(c style) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(style, "style");
            this.f15902f = style;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void i() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (this.f15898b.get() != null) {
                b bVar = new b(this, this.f15899c);
                this.f15900d = bVar;
                View viewFindViewById = bVar.findViewById(p0.f15693d);
                s.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById).setText(this.f15897a);
                if (this.f15902f == c.BLUE) {
                    bVar.a().setBackgroundResource(o0.f15684g);
                    bVar.b().setImageResource(o0.f15685h);
                    bVar.c().setImageResource(o0.f15686i);
                    bVar.d().setImageResource(o0.f15687j);
                } else {
                    bVar.a().setBackgroundResource(o0.f15680c);
                    bVar.b().setImageResource(o0.f15681d);
                    bVar.c().setImageResource(o0.f15682e);
                    bVar.d().setImageResource(o0.f15683f);
                }
                Context context = this.f15899c;
                s.f(context, "null cannot be cast to non-null type android.app.Activity");
                View decorView = ((Activity) context).getWindow().getDecorView();
                s.g(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                e();
                bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                this.f15901e = popupWindow;
                popupWindow.showAsDropDown((View) this.f15898b.get());
                m();
                if (this.f15903g > 0) {
                    bVar.postDelayed(new Runnable() { // from class: com.facebook.login.widget.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.j(this.f15894a);
                        }
                    }, this.f15903g);
                }
                popupWindow.setTouchable(true);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.widget.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        i.k(this.f15895a, view);
                    }
                });
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
