package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ScreenshotActionActivity;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.f0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class v implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f58933i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f58934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dk.a f58935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f58936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f58937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f58938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f58939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f58941h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f58942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ v f58943h;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private final class a extends FrameLayout {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final float f58944a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f58945b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f58946c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f58947d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f58948e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private float f58949f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f58950g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f58951h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f58952i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ b f58953j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Context context) {
                super(context);
                kotlin.jvm.internal.s.h(context, "context");
                this.f58953j = bVar;
                this.f58951h = true;
                this.f58944a = ViewConfiguration.get(context).getScaledTouchSlop();
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                kotlin.jvm.internal.s.h(motionEvent, "motionEvent");
                this.f58949f = motionEvent.getRawX();
                this.f58950g = motionEvent.getRawY();
                if (motionEvent.getAction() == 0) {
                    this.f58945b = this.f58953j.f58942g.getX();
                    this.f58946c = this.f58953j.f58942g.getY();
                    this.f58947d = this.f58949f;
                    this.f58948e = this.f58950g;
                    this.f58953j.f58943h.f58937d.removeCallbacks(this.f58953j.f58943h.f58941h);
                }
                if (this.f58951h) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                kotlin.jvm.internal.s.h(motionEvent, "motionEvent");
                int action = motionEvent.getAction();
                if ((action == 1 || action == 2) && (Math.abs(this.f58949f - this.f58947d) > this.f58944a || Math.abs(this.f58950g - this.f58948e) > this.f58944a)) {
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent event) {
                kotlin.jvm.internal.s.h(event, "event");
                int action = event.getAction();
                if (action == 1) {
                    if (this.f58952i) {
                        this.f58953j.f58942g.animate().x(0.0f).alpha(1.0f).setDuration(200L).start();
                        this.f58952i = false;
                    }
                    if (!this.f58953j.f58943h.f58940g) {
                        this.f58953j.f58943h.f58937d.postDelayed(this.f58953j.f58943h.f58941h, 5000L);
                    }
                } else if (action == 2) {
                    float f10 = this.f58949f - this.f58947d;
                    float f11 = this.f58950g - this.f58948e;
                    if (yl.g.c(Math.abs(f10), Math.abs(f11)) > this.f58944a) {
                        if (Math.abs(f10) > Math.abs(f11)) {
                            this.f58953j.f58942g.setX(this.f58945b + f10);
                            this.f58953j.f58942g.setAlpha(1 - (Math.abs(f10) / this.f58953j.f58942g.getWidth()));
                            if (Math.abs(f10) > this.f58953j.f58942g.getWidth() / 4) {
                                this.f58953j.r(Math.signum(f10) * (this.f58953j.f58942g.getWidth() - f10));
                                this.f58951h = false;
                            } else {
                                this.f58952i = true;
                            }
                        } else if (f11 < (-this.f58944a)) {
                            this.f58951h = false;
                            this.f58953j.s();
                        }
                    }
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: zg.v$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C0903b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f58954a;

            C0903b(v vVar) {
                this.f58954a = vVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                kotlin.jvm.internal.s.h(animator, jyeoXJ.gzqrH);
                super.onAnimationEnd(animator);
                b bVar = this.f58954a.f58936c;
                kotlin.jvm.internal.s.e(bVar);
                bVar.n();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f58955a;

            c(v vVar) {
                this.f58955a = vVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.s.h(animation, "animation");
                super.onAnimationEnd(animation);
                b bVar = this.f58955a.f58936c;
                kotlin.jvm.internal.s.e(bVar);
                bVar.n();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, Context context) {
            View viewFindViewById;
            View viewFindViewById2;
            View viewFindViewById3;
            View viewFindViewById4;
            super(context);
            kotlin.jvm.internal.s.h(context, "context");
            this.f58943h = vVar;
            this.f58878b.flags = 288;
            this.f58879c.setSystemUiVisibility(4);
            a aVar = new a(this, context);
            this.f58942g = aVar;
            d(aVar);
            vVar.f58938e = LayoutInflater.from(context).inflate(R.layout.notification_screenshot_captured, (ViewGroup) null);
            aVar.addView(vVar.f58938e);
            aVar.setY(-context.getResources().getDimensionPixelSize(R.dimen.screenshot_notification_height));
            View view = vVar.f58938e;
            if (view != null && (viewFindViewById4 = view.findViewById(R.id.view_image_ll)) != null) {
                viewFindViewById4.setOnClickListener(vVar);
            }
            View view2 = vVar.f58938e;
            if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.share_ll)) != null) {
                viewFindViewById3.setOnClickListener(vVar);
            }
            View view3 = vVar.f58938e;
            if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.delete_ll)) != null) {
                viewFindViewById2.setOnClickListener(vVar);
            }
            View view4 = vVar.f58938e;
            if (view4 == null || (viewFindViewById = view4.findViewById(R.id.edit_ll)) == null) {
                return;
            }
            viewFindViewById.setOnClickListener(vVar);
        }

        @Override // zg.o
        protected int j() {
            return -2;
        }

        @Override // zg.o
        protected int l() {
            return -1;
        }

        public final void q() {
            this.f58942g.animate().translationY(0.0f).setDuration(300L).start();
        }

        public final void r(float f10) {
            this.f58943h.f58940g = true;
            this.f58942g.animate().translationX(f10).setListener(new C0903b(this.f58943h)).setDuration(300L).start();
        }

        public final void s() {
            this.f58943h.f58940g = true;
            this.f58942g.animate().translationY(-this.f58942g.getHeight()).setListener(new c(this.f58943h)).setDuration(300L).start();
        }
    }

    public v(Context mContext, dk.a drawerBubbleManager) {
        kotlin.jvm.internal.s.h(mContext, "mContext");
        kotlin.jvm.internal.s.h(drawerBubbleManager, "drawerBubbleManager");
        this.f58934a = mContext;
        this.f58935b = drawerBubbleManager;
        this.f58937d = new Handler();
        this.f58941h = new Runnable() { // from class: zg.u
            @Override // java.lang.Runnable
            public final void run() {
                v.i(this.f58932a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(v vVar) {
        b bVar = vVar.f58936c;
        kotlin.jvm.internal.s.e(bVar);
        bVar.s();
    }

    public final void j(Bitmap bitmap, Uri uri) {
        this.f58939f = uri;
        b bVar = new b(this, this.f58934a);
        this.f58936c = bVar;
        kotlin.jvm.internal.s.e(bVar);
        bVar.e();
        View view = this.f58938e;
        View viewFindViewById = view != null ? view.findViewById(R.id.thumb_iv) : null;
        kotlin.jvm.internal.s.f(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewFindViewById).setImageBitmap(bitmap);
        b bVar2 = this.f58936c;
        kotlin.jvm.internal.s.e(bVar2);
        bVar2.q();
        this.f58937d.postDelayed(this.f58941h, 5000L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        kotlin.jvm.internal.s.h(v10, "v");
        b bVar = this.f58936c;
        kotlin.jvm.internal.s.e(bVar);
        bVar.n();
        ((bh.e) this.f58935b.get()).A();
        switch (v10.getId()) {
            case R.id.delete_ll /* 2131362153 */:
            case R.id.share_ll /* 2131363096 */:
                Intent intent = new Intent(this.f58934a, (Class<?>) ScreenshotActionActivity.class);
                intent.addFlags(268435456);
                intent.setData(this.f58939f);
                intent.putExtra("action", v10.getId());
                this.f58934a.startActivity(intent);
                break;
            case R.id.edit_ll /* 2131362211 */:
            case R.id.view_image_ll /* 2131363386 */:
                f0.A(this.f58934a, this.f58939f, 1);
                break;
        }
    }
}
