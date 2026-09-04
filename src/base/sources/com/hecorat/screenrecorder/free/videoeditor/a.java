package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import em.o0;
import fl.g0;
import fl.q;
import gl.r;
import hm.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import ph.w;
import ph.y;
import tf.a3;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001M\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\fH\u0004¢\u0006\u0004\b#\u0010$J+\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H&¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0010H&¢\u0006\u0004\b,\u0010\u0005J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0-H$¢\u0006\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100R\"\u00108\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010;\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010,R\u0016\u0010@\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010,R\u0016\u0010B\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010,R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010:R\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/a;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/a3;", "Lcom/hecorat/screenrecorder/free/videoeditor/view/VideoElementSeekBar$b;", "<init>", "()V", "Lqh/l;", "item", "Lfl/q;", "", "V", "(Lqh/l;)Lfl/q;", "Lqh/k;", "", "startTime", "duration", "Lfl/g0;", "i0", "(Lqh/k;JJ)V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "X", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/a3;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "timelineItem", "S", "(Lqh/k;)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(JJ)Lfl/q;", "visualItem", "c", "(Lqh/l;)V", "Y", "Z", "", "U", "()Ljava/util/List;", "F", "pixelPerMs", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "J", "W", "()J", "setVideoListDuration", "(J)V", "videoListDuration", "e", "I", "thumbListWidth", "", "f", "isInitialScrollCall", "g", "isSeekbarTouched", "h", "isRecycleViewTouched", "Landroidx/recyclerview/widget/LinearLayoutManager;", "i", "Landroidx/recyclerview/widget/LinearLayoutManager;", "thumbLayoutManager", "j", "thumbWidth", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", CampaignEx.JSON_KEY_AD_K, "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "onTimelineScrollListener", "com/hecorat/screenrecorder/free/videoeditor/a$a", "l", "Lcom/hecorat/screenrecorder/free/videoeditor/a$a;", "onThumbScrollListener", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a extends d<a3> implements VideoElementSeekBar.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long videoListDuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int thumbListWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isSeekbarTouched;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isRecycleViewTouched;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public LinearLayoutManager thumbLayoutManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int thumbWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float pixelPerMs = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isInitialScrollCall = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final ViewTreeObserver.OnScrollChangedListener onTimelineScrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: oh.p
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            com.hecorat.screenrecorder.free.videoeditor.a.a0(this.f48775a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final C0340a onThumbScrollListener = new C0340a();

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0340a extends RecyclerView.v {
        public C0340a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iG;
            s.h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (s.c(a.this.v().p1().f(), Boolean.TRUE) || !a.this.isRecycleViewTouched) {
                return;
            }
            a.this.isSeekbarTouched = false;
            LinearLayoutManager linearLayoutManager = a.this.thumbLayoutManager;
            LinearLayoutManager linearLayoutManager2 = null;
            if (linearLayoutManager == null) {
                s.w("thumbLayoutManager");
                linearLayoutManager = null;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            LinearLayoutManager linearLayoutManager3 = a.this.thumbLayoutManager;
            if (linearLayoutManager3 == null) {
                s.w("thumbLayoutManager");
            } else {
                linearLayoutManager2 = linearLayoutManager3;
            }
            View viewFindViewByPosition = linearLayoutManager2.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                return;
            }
            if (iFindFirstVisibleItemPosition == 0) {
                iG = -viewFindViewByPosition.getLeft();
            } else {
                iG = ((iFindFirstVisibleItemPosition - 1) * a.this.thumbWidth) + ((nh.b.g(a.this.getContext()) / 2) - viewFindViewByPosition.getLeft());
            }
            a.this.v().T1(vl.a.d(iG / a.this.pixelPerMs));
            ((a3) a.this.w()).H.scrollTo(iG, 0);
            wp.a.a("First visible item position: " + iFindFirstVisibleItemPosition + ", x: " + iG, new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23376r;

        /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0341a extends kotlin.coroutines.jvm.internal.m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23378r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f23379s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a f23380t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0341a(a aVar, kl.f fVar) {
                super(2, fVar);
                this.f23380t = aVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, kl.f fVar) {
                return ((C0341a) create(str, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0341a c0341a = new C0341a(this.f23380t, fVar);
                c0341a.f23379s = obj;
                return c0341a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23378r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                ((a3) this.f23380t.w()).D.F((String) this.f23379s);
                return g0.f38750a;
            }
        }

        public b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return a.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23376r;
            if (i10 == 0) {
                fl.s.b(obj);
                z zVarB1 = a.this.v().b1();
                C0341a c0341a = new C0341a(a.this, null);
                s.f(zVarB1, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23376r = 1;
                if (hm.g.i(zVarB1, c0341a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23381a;

        public c(Function1 function) {
            s.h(function, "function");
            this.f23381a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23381a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23381a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final q V(qh.l item) {
        return new q(Float.valueOf((item.b() - (nh.b.g(getContext()) / 2)) / this.pixelPerMs), Float.valueOf((item.c() - item.b()) / this.pixelPerMs));
    }

    public static final void a0(a aVar) {
        if (s.c(aVar.v().p1().f(), Boolean.TRUE) || !aVar.isSeekbarTouched) {
            return;
        }
        aVar.isRecycleViewTouched = false;
        int scrollX = ((a3) aVar.w()).H.getScrollX();
        aVar.v().T1(vl.a.d(scrollX / aVar.pixelPerMs));
        LinearLayoutManager linearLayoutManager = aVar.thumbLayoutManager;
        if (linearLayoutManager == null) {
            s.w("thumbLayoutManager");
            linearLayoutManager = null;
        }
        linearLayoutManager.scrollToPositionWithOffset(0, -scrollX);
        wp.a.a(" On scroll changed " + scrollX, new Object[0]);
    }

    public static final g0 b0(a aVar) {
        ((AddAudioFragment) aVar).p0();
        return g0.f38750a;
    }

    public static final void c0(a aVar) {
        Object objF = aVar.v().X0().f();
        s.e(objF);
        long jLongValue = ((Number) objF).longValue();
        if (jLongValue > 0) {
            int i10 = (int) (jLongValue * aVar.pixelPerMs);
            ((a3) aVar.w()).H.scrollTo(i10, 0);
            LinearLayoutManager linearLayoutManager = aVar.thumbLayoutManager;
            if (linearLayoutManager == null) {
                s.w("thumbLayoutManager");
                linearLayoutManager = null;
            }
            linearLayoutManager.scrollToPositionWithOffset(0, -i10);
        }
    }

    public static final g0 d0(a aVar, Long l10) {
        wp.a.a("Position changed: " + l10, new Object[0]);
        if (s.c(aVar.v().p1().f(), Boolean.TRUE)) {
            int iLongValue = (int) (l10.longValue() * aVar.pixelPerMs);
            ((a3) aVar.w()).H.scrollTo(iLongValue, 0);
            LinearLayoutManager linearLayoutManager = aVar.thumbLayoutManager;
            if (linearLayoutManager == null) {
                s.w("thumbLayoutManager");
                linearLayoutManager = null;
            }
            linearLayoutManager.scrollToPositionWithOffset(0, -iLongValue);
        }
        return g0.f38750a;
    }

    public static final boolean e0(a aVar, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 && motionEvent.getAction() != 8 && motionEvent.getAction() != 0) {
            return false;
        }
        aVar.isSeekbarTouched = true;
        aVar.v().C1();
        return false;
    }

    public static final boolean f0(a aVar, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 && motionEvent.getAction() != 8 && motionEvent.getAction() != 0) {
            return false;
        }
        aVar.isRecycleViewTouched = true;
        aVar.v().C1();
        return false;
    }

    public static final void g0(a aVar, View view) {
        aVar.Y();
    }

    public static final void h0(a aVar, View view) {
        aVar.Z();
    }

    private final void i0(qh.k item, long startTime, long duration) {
        item.f(startTime);
        item.e(duration);
        Object objF = v().X0().f();
        s.e(objF);
        long jLongValue = ((Number) objF).longValue();
        if (jLongValue >= startTime && jLongValue <= startTime + duration) {
            v().n0().q(item);
        } else if (s.c(item, v().n0().f())) {
            v().n0().q(null);
        }
    }

    protected final q T(long startTime, long duration) {
        float fG = nh.b.g(getContext()) / 2;
        float f10 = this.pixelPerMs;
        int i10 = (int) (fG + (startTime * f10));
        return new q(Integer.valueOf(i10), Integer.valueOf((int) (i10 + (duration * f10))));
    }

    protected abstract List U();

    /* JADX INFO: renamed from: W, reason: from getter */
    protected final long getVideoListDuration() {
        return this.videoListDuration;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public a3 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        a3 a3VarY = a3.Y(layoutInflater, container, false);
        s.g(a3VarY, "inflate(...)");
        return a3VarY;
    }

    public abstract void Y();

    public abstract void Z();

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar.b
    public void c(qh.l visualItem) {
        s.h(visualItem, "visualItem");
        List<qh.k> listU = U();
        for (qh.k kVar : listU) {
            if (s.c(kVar.getId(), visualItem.getId())) {
                q qVarV = V(visualItem);
                i0(kVar, (long) ((Number) qVarV.h()).floatValue(), (long) ((Number) qVarV.i()).floatValue());
                break;
            }
        }
        r.x(listU);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((a3) w()).H.getViewTreeObserver().removeOnScrollChangedListener(this.onTimelineScrollListener);
        ((a3) w()).F.m1(this.onThumbScrollListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a3) w()).H.getViewTreeObserver().addOnScrollChangedListener(this.onTimelineScrollListener);
        ((a3) w()).F.n(this.onThumbScrollListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        v().n0().q(null);
        super.onStop();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((ImageButton) ((a3) w()).B().findViewById(R.id.close_iv)).setVisibility(8);
        a3 a3Var = (a3) w();
        a3Var.S(getViewLifecycleOwner());
        a3Var.a0(v());
        ph.s sVar = new ph.s(v().k1());
        boolean z10 = this instanceof AddAudioFragment;
        ((a3) w()).F.setAdapter(new androidx.recyclerview.widget.g(z10 ? new y(new tl.a() { // from class: oh.i
            @Override // tl.a
            public final Object invoke() {
                return com.hecorat.screenrecorder.free.videoeditor.a.b0(this.f48694a);
            }
        }) : new w(), sVar, new w()));
        RecyclerView.q layoutManager = ((a3) w()).F.getLayoutManager();
        s.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.thumbLayoutManager = (LinearLayoutManager) layoutManager;
        this.videoListDuration = v().j1();
        this.thumbWidth = getResources().getDimensionPixelSize(R.dimen.thumb_width);
        int itemCount = sVar.getItemCount() * this.thumbWidth;
        this.thumbListWidth = itemCount;
        this.pixelPerMs = itemCount / this.videoListDuration;
        ((a3) w()).D.G((int) this.videoListDuration, this.thumbListWidth, this);
        Iterator it = U().iterator();
        while (it.hasNext()) {
            S((qh.k) it.next());
        }
        ((a3) w()).H.post(new Runnable() { // from class: oh.j
            @Override // java.lang.Runnable
            public final void run() {
                com.hecorat.screenrecorder.free.videoeditor.a.c0(this.f48701a);
            }
        });
        v().X0().j(getViewLifecycleOwner(), new c(new Function1() { // from class: oh.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.a.d0(this.f48707a, (Long) obj);
            }
        }));
        ((a3) w()).H.setOnTouchListener(new View.OnTouchListener() { // from class: oh.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return com.hecorat.screenrecorder.free.videoeditor.a.e0(this.f48712a, view2, motionEvent);
            }
        });
        ((a3) w()).F.setOnTouchListener(new View.OnTouchListener() { // from class: oh.m
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return com.hecorat.screenrecorder.free.videoeditor.a.f0(this.f48729a, view2, motionEvent);
            }
        });
        ((a3) w()).A.setOnClickListener(new View.OnClickListener() { // from class: oh.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.hecorat.screenrecorder.free.videoeditor.a.g0(this.f48762a, view2);
            }
        });
        ((a3) w()).C.setOnClickListener(new View.OnClickListener() { // from class: oh.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.hecorat.screenrecorder.free.videoeditor.a.h0(this.f48767a, view2);
            }
        });
        if (z10) {
            return;
        }
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner).d(new b(null));
    }

    protected final void S(qh.k timelineItem) {
        s.h(timelineItem, mDXVAtwcaFMHJ.PqYtIaZ);
        q qVarT = T(timelineItem.c(), timelineItem.b());
        ((a3) w()).D.D(new qh.l(timelineItem.getId(), timelineItem.d(), ((Number) qVarT.h()).intValue(), ((Number) qVarT.i()).intValue()));
    }
}
