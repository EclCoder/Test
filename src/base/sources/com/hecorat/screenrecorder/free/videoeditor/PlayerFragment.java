package com.hecorat.screenrecorder.free.videoeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import bm.r;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ScreenshotReviewActivity;
import com.hecorat.screenrecorder.free.videoeditor.PlayerFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import em.c1;
import em.o0;
import fl.g0;
import fl.s;
import fl.v;
import hm.z;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import nh.f0;
import oh.c4;
import oh.m4;
import oh.q1;
import oh.q3;
import oh.r3;
import re.xQrM.UoyZyZEcGYBpIg;
import tf.q4;
import uh.y;
import y3.d1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\b\u0005*\u0002fj\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\tJ!\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0003J\u0019\u0010(\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b(\u0010\tJ\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0003J+\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u0003R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NR\u0016\u0010U\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u001fR\u0016\u0010Y\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010PR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010NR\u0016\u0010e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010NR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/PlayerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", "c0", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "b0", "(Ljava/lang/String;)V", "", "relX", "relY", "scaleFactor", "m0", "(FFF)V", "", "firstFrameRendered", "Lqh/h;", "bgRatioItem", "k0", "(ZLqh/h;)V", "l0", "containerRatioItem", "n0", "(Lqh/h;)V", "g0", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "pointerIndex", "Z", "(Landroid/view/MotionEvent;I)F", "a0", "V", "fragment", "tag", "i0", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "h0", "j0", "W", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "Luh/y;", "a", "Lfl/k;", "X", "()Luh/y;", "activityViewModel", "Ltf/q4;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ltf/q4;", "binding", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "Landroidx/constraintlayout/widget/ConstraintLayout;", "playerWrapper", "Landroid/view/TextureView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/view/TextureView;", "textureView", "Landroid/view/ScaleGestureDetector;", "e", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "f", "F", "g", "I", "mActivePointerId", "h", "playerWidth", "i", "playerHeight", "j", "surfaceSetupCalled", CampaignEx.JSON_KEY_AD_K, "bottomId", "Llg/a;", "l", "Llg/a;", "Y", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "m", "dX", "n", "dY", "com/hecorat/screenrecorder/free/videoeditor/PlayerFragment$o", "o", "Lcom/hecorat/screenrecorder/free/videoeditor/PlayerFragment$o;", "touchListener", "com/hecorat/screenrecorder/free/videoeditor/PlayerFragment$k", TtmlNode.TAG_P, "Lcom/hecorat/screenrecorder/free/videoeditor/PlayerFragment$k;", "scaleListener", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlayerFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public q4 binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ConstraintLayout playerWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public TextureView textureView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ScaleGestureDetector scaleDetector;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float playerWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float playerHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean surfaceSetupCalled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float dX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float dY;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final fl.k activityViewModel = t0.b(this, l0.b(y.class), new l(this), new m(null, this), new n(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float scaleFactor = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int mActivePointerId = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int bottomId = R.id.editorPreviewFragment;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final o touchListener = new o();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final k scaleListener = new k();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23300r;

        /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.PlayerFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0339a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23302r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ int f23303s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23304t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0339a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23304t = playerFragment;
            }

            public final Object a(int i10, kl.f fVar) {
                return ((C0339a) create(Integer.valueOf(i10), fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0339a c0339a = new C0339a(this.f23304t, fVar);
                c0339a.f23303s = ((Number) obj).intValue();
                return c0339a;
            }

            @Override // tl.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (kl.f) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23302r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                int i10 = this.f23303s;
                ConstraintLayout constraintLayout = null;
                switch (i10) {
                    case R.id.addStickerFragment /* 2131361911 */:
                        this.f23304t.i0(new r3(), null);
                        break;
                    case R.id.addTextFragment /* 2131361912 */:
                        this.f23304t.i0(new c4(), null);
                        break;
                    case R.id.autoCaptionFragment /* 2131361952 */:
                    case R.id.editorPreviewFragment /* 2131362214 */:
                        this.f23304t.i0(new q3(), "fragment_preview_overlay");
                        break;
                    case R.id.cropFragment /* 2131362120 */:
                        this.f23304t.i0(new q1(), null);
                        break;
                    case R.id.textSettingsFragment /* 2131363200 */:
                        this.f23304t.i0(new m4(), null);
                        break;
                    default:
                        this.f23304t.h0();
                        break;
                }
                if (i10 == R.id.addBackgroundFragment || i10 == R.id.ratioFragment) {
                    ConstraintLayout constraintLayout2 = this.f23304t.playerWrapper;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.s.w("playerWrapper");
                    } else {
                        constraintLayout = constraintLayout2;
                    }
                    constraintLayout.setOnTouchListener(this.f23304t.touchListener);
                    this.f23304t.scaleDetector = new ScaleGestureDetector(this.f23304t.requireContext(), this.f23304t.scaleListener);
                } else {
                    ConstraintLayout constraintLayout3 = this.f23304t.playerWrapper;
                    if (constraintLayout3 == null) {
                        kotlin.jvm.internal.s.w("playerWrapper");
                        constraintLayout3 = null;
                    }
                    constraintLayout3.setOnTouchListener(null);
                }
                return g0.f38750a;
            }
        }

        public a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23300r;
            if (i10 == 0) {
                s.b(obj);
                z zVarS0 = PlayerFragment.this.X().s0();
                C0339a c0339a = new C0339a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarS0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23300r = 1;
                if (hm.g.i(zVarS0, c0339a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23305r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23307r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ int f23308s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23309t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23309t = playerFragment;
            }

            public final Object a(int i10, kl.f fVar) {
                return ((a) create(Integer.valueOf(i10), fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f23309t, fVar);
                aVar.f23308s = ((Number) obj).intValue();
                return aVar;
            }

            @Override // tl.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (kl.f) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23307r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                int i10 = this.f23308s;
                wp.a.a("currentMediaIndex changed, reason " + i10 + " setupPlayerView", new Object[0]);
                this.f23309t.k0(i10 == 1, null);
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
            return PlayerFragment.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23305r;
            if (i10 == 0) {
                s.b(obj);
                z zVarR0 = PlayerFragment.this.X().R0();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarR0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23305r = 1;
                if (hm.g.i(zVarR0, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23310r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23312r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23313s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23313s = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f23313s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23312r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                wp.a.a("firstFrameRenderedEvent is called", new Object[0]);
                if (!this.f23313s.surfaceSetupCalled) {
                    this.f23313s.surfaceSetupCalled = true;
                    this.f23313s.n0(null);
                }
                return g0.f38750a;
            }
        }

        public c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23310r;
            if (i10 == 0) {
                s.b(obj);
                z zVarO0 = PlayerFragment.this.X().O0();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarO0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23310r = 1;
                if (hm.g.i(zVarO0, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23314r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23316r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23317s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23317s = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f23317s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23316r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f23317s.g0();
                return g0.f38750a;
            }
        }

        public d(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new d(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23314r;
            if (i10 == 0) {
                s.b(obj);
                z zVarZ0 = PlayerFragment.this.X().z0();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarZ0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23314r = 1;
                if (hm.g.i(zVarZ0, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23318r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23320r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f23321s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23322t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23322t = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(qh.h hVar, kl.f fVar) {
                return ((a) create(hVar, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f23322t, fVar);
                aVar.f23321s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23320r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f23322t.k0(true, (qh.h) this.f23321s);
                return g0.f38750a;
            }
        }

        public e(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new e(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23318r;
            if (i10 == 0) {
                s.b(obj);
                z zVarF1 = PlayerFragment.this.X().f1();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarF1, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23318r = 1;
                if (hm.g.i(zVarF1, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23323r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23325r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f23326s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23327t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23327t = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, kl.f fVar) {
                return ((a) create(str, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f23327t, fVar);
                aVar.f23326s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23325r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f23327t.V((String) this.f23326s);
                return g0.f38750a;
            }
        }

        public f(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new f(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23323r;
            if (i10 == 0) {
                s.b(obj);
                z zVarA0 = PlayerFragment.this.X().A0();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarA0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23323r = 1;
                if (hm.g.i(zVarA0, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23328r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23330r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23331s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23331s = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f23331s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23330r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f23331s.k0(true, null);
                return g0.f38750a;
            }
        }

        public g(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((g) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new g(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23328r;
            if (i10 == 0) {
                s.b(obj);
                z zVarC1 = PlayerFragment.this.X().c1();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarC1, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23328r = 1;
                if (hm.g.i(zVarC1, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class h extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23332r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23334r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f23335s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23336t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23336t = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, kl.f fVar) {
                return ((a) create(str, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f23336t, fVar);
                aVar.f23335s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23334r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f23336t.j0((String) this.f23335s);
                return g0.f38750a;
            }
        }

        public h(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new h(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23332r;
            if (i10 == 0) {
                s.b(obj);
                z zVarE1 = PlayerFragment.this.X().e1();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarE1, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23332r = 1;
                if (hm.g.i(zVarE1, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class i extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23337r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23339r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23340s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, kl.f fVar) {
                super(2, fVar);
                this.f23340s = playerFragment;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f23340s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23339r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.f23340s.W();
                return g0.f38750a;
            }
        }

        public i(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new i(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23337r;
            if (i10 == 0) {
                s.b(obj);
                z zVarN0 = PlayerFragment.this.X().N0();
                a aVar = new a(PlayerFragment.this, null);
                kotlin.jvm.internal.s.f(zVarN0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23337r = 1;
                if (hm.g.i(zVarN0, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class j extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23341r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Bitmap f23343t;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23344r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ PlayerFragment f23345s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Uri f23346t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerFragment playerFragment, Uri uri, kl.f fVar) {
                super(2, fVar);
                this.f23345s = playerFragment;
                this.f23346t = uri;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f23345s, this.f23346t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23344r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                ScreenshotReviewActivity.B0(this.f23345s.requireContext(), this.f23346t);
                return g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Bitmap bitmap, kl.f fVar) {
            super(2, fVar);
            this.f23343t = bitmap;
        }

        public static final void k(PlayerFragment playerFragment, Uri uri) {
            em.k.d(c0.a(playerFragment), c1.c(), null, new a(playerFragment, uri, null), 2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return PlayerFragment.this.new j(this.f23343t, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((j) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f23341r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Context contextRequireContext = PlayerFragment.this.requireContext();
            Bitmap bitmap = this.f23343t;
            final PlayerFragment playerFragment = PlayerFragment.this;
            f0.H(contextRequireContext, bitmap, true, new f0.e() { // from class: com.hecorat.screenrecorder.free.videoeditor.h
                @Override // nh.f0.e
                public final void a(Uri uri) {
                    PlayerFragment.j.k(playerFragment, uri);
                }
            });
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class k implements ScaleGestureDetector.OnScaleGestureListener {
        public k() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            kotlin.jvm.internal.s.h(detector, "detector");
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            kotlin.jvm.internal.s.h(detector, "detector");
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            kotlin.jvm.internal.s.h(detector, "detector");
            PlayerFragment.this.scaleFactor *= detector.getScaleFactor();
            ConstraintLayout constraintLayout = PlayerFragment.this.playerWrapper;
            ConstraintLayout constraintLayout2 = null;
            String str = giNWGaNAgVQoO.bcwUXZGQStGYxnK;
            if (constraintLayout == null) {
                kotlin.jvm.internal.s.w(str);
                constraintLayout = null;
            }
            constraintLayout.setScaleX(PlayerFragment.this.scaleFactor);
            ConstraintLayout constraintLayout3 = PlayerFragment.this.playerWrapper;
            if (constraintLayout3 == null) {
                kotlin.jvm.internal.s.w(str);
            } else {
                constraintLayout2 = constraintLayout3;
            }
            constraintLayout2.setScaleY(PlayerFragment.this.scaleFactor);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class l extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f23348a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23348a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class m extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23349a = aVar;
            this.f23350b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23349a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23350b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class n extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23351a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f23351a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23351a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class o implements View.OnTouchListener {
        public o() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(motionEvent, UoyZyZEcGYBpIg.ZKKunDgEqyjn);
            ScaleGestureDetector scaleGestureDetector = PlayerFragment.this.scaleDetector;
            ScaleGestureDetector scaleGestureDetector2 = null;
            if (scaleGestureDetector == null) {
                kotlin.jvm.internal.s.w("scaleDetector");
                scaleGestureDetector = null;
            }
            scaleGestureDetector.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                PlayerFragment.this.mActivePointerId = motionEvent.getPointerId(0);
                PlayerFragment.this.dX = view.getX() - motionEvent.getRawX();
                PlayerFragment.this.dY = view.getY() - motionEvent.getRawY();
            } else if (action == 1) {
                PlayerFragment.this.mActivePointerId = -1;
            } else if (action == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(PlayerFragment.this.mActivePointerId);
                ScaleGestureDetector scaleGestureDetector3 = PlayerFragment.this.scaleDetector;
                if (scaleGestureDetector3 == null) {
                    kotlin.jvm.internal.s.w("scaleDetector");
                } else {
                    scaleGestureDetector2 = scaleGestureDetector3;
                }
                if (!scaleGestureDetector2.isInProgress()) {
                    view.animate().x(PlayerFragment.this.Z(motionEvent, iFindPointerIndex) + PlayerFragment.this.dX).y(PlayerFragment.this.a0(motionEvent, iFindPointerIndex) + PlayerFragment.this.dY).setDuration(0L).start();
                }
                PlayerFragment.this.dX = view.getX() - PlayerFragment.this.Z(motionEvent, iFindPointerIndex);
                PlayerFragment.this.dY = view.getY() - PlayerFragment.this.a0(motionEvent, iFindPointerIndex);
            } else if (action == 3) {
                PlayerFragment.this.mActivePointerId = -1;
            } else {
                if (action != 6) {
                    return true;
                }
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == PlayerFragment.this.mActivePointerId) {
                    int i10 = action2 == 0 ? 1 : 0;
                    PlayerFragment.this.dX = view.getX() - PlayerFragment.this.Z(motionEvent, i10);
                    PlayerFragment.this.dY = view.getY() - PlayerFragment.this.a0(motionEvent, i10);
                    PlayerFragment.this.mActivePointerId = motionEvent.getPointerId(i10);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(String path) {
        ConstraintLayout constraintLayout = this.playerWrapper;
        TextureView textureView = null;
        if (constraintLayout == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout = null;
        }
        float x10 = constraintLayout.getX();
        ConstraintLayout constraintLayout2 = this.playerWrapper;
        if (constraintLayout2 == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout2 = null;
        }
        float y10 = constraintLayout2.getY();
        q4 q4Var = this.binding;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        int width = q4Var.B.getWidth();
        q4 q4Var2 = this.binding;
        if (q4Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var2 = null;
        }
        int height = q4Var2.B.getHeight();
        float f10 = width;
        float f11 = this.scaleFactor;
        TextureView textureView2 = this.textureView;
        if (textureView2 == null) {
            kotlin.jvm.internal.s.w("textureView");
            textureView2 = null;
        }
        float width2 = x10 + ((f10 - (f11 * textureView2.getWidth())) / 2.0f);
        float f12 = height;
        float f13 = this.scaleFactor;
        TextureView textureView3 = this.textureView;
        if (textureView3 == null) {
            kotlin.jvm.internal.s.w("textureView");
            textureView3 = null;
        }
        float height2 = y10 + ((f12 - (f13 * textureView3.getHeight())) / 2.0f);
        float f14 = this.scaleFactor;
        TextureView textureView4 = this.textureView;
        if (textureView4 == null) {
            kotlin.jvm.internal.s.w("textureView");
            textureView4 = null;
        }
        float width3 = (f14 * textureView4.getWidth()) + width2;
        float f15 = this.scaleFactor;
        TextureView textureView5 = this.textureView;
        if (textureView5 == null) {
            kotlin.jvm.internal.s.w("textureView");
        } else {
            textureView = textureView5;
        }
        float height3 = (f15 * textureView.getHeight()) + height2;
        if (width2 <= 1.0f && height2 <= 1.0f) {
            float f16 = 1;
            if (width3 + f16 >= f10 && height3 + f16 >= f12) {
                m0(0.0f, 0.0f, 0.9f);
            }
        }
        b0(path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    public final void W() {
        boolean z10;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Iterator it = X().k1().iterator();
        long jW = 0;
        while (it.hasNext()) {
            jW += ((ng.d) it.next()).w();
        }
        if (!sh.b.z(context, Y(), jW)) {
            sh.b.D(context);
            return;
        }
        if (nh.l0.o()) {
            z10 = false;
        } else {
            Object objF = X().q1().f();
            kotlin.jvm.internal.s.e(objF);
            if (((Boolean) objF).booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        y yVarX = X();
        lg.a aVarY = Y();
        q4 q4Var = this.binding;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        v vVarL0 = yVarX.L0(aVarY, z10, q4Var.B.getWidth());
        String str = kotlin.jvm.internal.s.c("GIF", X().U0().f()) ? "image/*" : "video/*";
        ArrayList arrayList = new ArrayList();
        for (ng.d dVar : X().k1()) {
            arrayList.add(new qh.e(dVar.t(), dVar.b()));
        }
        for (qh.a aVar : X().p0()) {
            arrayList.add(new qh.e(aVar.i(), aVar.l()));
        }
        for (qh.c cVar : X().H0()) {
            if (!cVar.o()) {
                arrayList.add(new qh.e(cVar.p(), cVar.r()));
            }
        }
        com.hecorat.screenrecorder.free.videoeditor.e.INSTANCE.a((String) vVarL0.i(), (String) vVarL0.j(), ((Number) vVarL0.k()).longValue(), str, arrayList).show(getChildFragmentManager(), "ExportFragment");
        X().q1().q(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y X() {
        return (y) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Z(MotionEvent event, int pointerIndex) {
        if (Build.VERSION.SDK_INT >= 29) {
            return event.getRawX(pointerIndex);
        }
        return event.getX(pointerIndex) + (event.getX() - event.getRawX());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float a0(MotionEvent event, int pointerIndex) {
        if (Build.VERSION.SDK_INT >= 29) {
            return event.getRawY(pointerIndex);
        }
        return event.getY(pointerIndex) + (event.getY() - event.getRawY());
    }

    private final void b0(String path) {
        if (path != null) {
            com.bumptech.glide.k kVarT = com.bumptech.glide.c.z(requireContext()).t(path);
            q4 q4Var = this.binding;
            if (q4Var == null) {
                kotlin.jvm.internal.s.w("binding");
                q4Var = null;
            }
            kVarT.A0(q4Var.A);
        }
    }

    private final void c0() {
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner).d(new a(null));
    }

    public static final g0 d0(PlayerFragment playerFragment, com.google.android.exoplayer2.k kVar) {
        q4 q4Var = playerFragment.binding;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        q4Var.D.setPlayer(kVar);
        return g0.f38750a;
    }

    public static final void e0(PlayerFragment playerFragment, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        d1 d1VarS;
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (view.getWidth() == i18 && view.getHeight() == i19) {
            return;
        }
        wp.a.a("root view has changed width, height. New: " + view.getWidth() + ", " + view.getHeight() + ". Old: " + i18 + ", " + i19 + ", rendered: " + playerFragment.surfaceSetupCalled, new Object[0]);
        y3.g0 g0VarR = sh.b.r(playerFragment.getActivity());
        if (g0VarR == null || (d1VarS = g0VarR.s()) == null) {
            return;
        }
        int iP = d1VarS.p();
        if (iP == R.id.cropFragment) {
            playerFragment.l0();
        } else if (iP == R.id.trimFragment || playerFragment.bottomId == R.id.trimFragment) {
            playerFragment.k0(false, null);
        } else {
            playerFragment.k0(playerFragment.surfaceSetupCalled, null);
            if (!playerFragment.surfaceSetupCalled) {
                playerFragment.surfaceSetupCalled = true;
            }
        }
        playerFragment.bottomId = iP;
    }

    public static final g0 f0(PlayerFragment playerFragment, String str) {
        wp.a.a("Default background path loaded", new Object[0]);
        playerFragment.b0(str);
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        q4 q4Var = this.binding;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        View videoSurfaceView = q4Var.D.getVideoSurfaceView();
        kotlin.jvm.internal.s.f(videoSurfaceView, "null cannot be cast to non-null type android.view.TextureView");
        em.k.d(c0.a(this), c1.b(), null, new j(((TextureView) videoSurfaceView).getBitmap(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        Fragment fragmentK0 = getChildFragmentManager().k0("fragment_preview_overlay");
        if (fragmentK0 != null) {
            getChildFragmentManager().q().n(fragmentK0).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(Fragment fragment, String tag) {
        androidx.fragment.app.f0 childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.s.g(childFragmentManager, "getChildFragmentManager(...)");
        androidx.fragment.app.o0 o0VarQ = childFragmentManager.q();
        kotlin.jvm.internal.s.g(o0VarQ, "beginTransaction()");
        if (tag != null) {
            o0VarQ.p(R.id.overlay_container, fragment, tag);
        } else {
            o0VarQ.o(R.id.overlay_container, fragment);
        }
        o0VarQ.t(true);
        o0VarQ.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(String path) {
        ConstraintLayout constraintLayout = this.playerWrapper;
        q4 q4Var = null;
        if (constraintLayout == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout = null;
        }
        float x10 = constraintLayout.getX();
        q4 q4Var2 = this.binding;
        if (q4Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var2 = null;
        }
        float width = x10 / q4Var2.B.getWidth();
        ConstraintLayout constraintLayout2 = this.playerWrapper;
        if (constraintLayout2 == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout2 = null;
        }
        float y10 = constraintLayout2.getY();
        q4 q4Var3 = this.binding;
        if (q4Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            q4Var = q4Var3;
        }
        float height = y10 / q4Var.B.getHeight();
        ng.d dVarG1 = X().g1();
        qh.b bVarF = dVarG1.f();
        if (bVarF != null) {
            if (path != null) {
                bVarF.f(path);
            }
            bVarF.g(width);
            bVarF.i(height);
            bVarF.j(this.scaleFactor);
            return;
        }
        if (path != null) {
            dVarG1.B(new qh.b(path, width, height, this.scaleFactor));
            return;
        }
        String str = (String) X().G0().f();
        if (str != null) {
            dVarG1.B(new qh.b(str, width, height, this.scaleFactor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(boolean firstFrameRendered, qh.h bgRatioItem) {
        float fJ;
        String strF;
        this.surfaceSetupCalled = firstFrameRendered;
        q4 q4Var = this.binding;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        int width = q4Var.B().getWidth();
        q4 q4Var2 = this.binding;
        if (q4Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var2 = null;
        }
        int height = q4Var2.B().getHeight();
        if (height == 0 || width == 0) {
            return;
        }
        wp.a.a("Actual width, height: %s,%s, firstFrameRendered: %s", Integer.valueOf(width), Integer.valueOf(height), Boolean.valueOf(firstFrameRendered));
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        ng.d dVarG1 = X().g1();
        int iA = dVarG1.A();
        int iP = dVarG1.p();
        RectF rectFI = dVarG1.i();
        if (rectFI != null) {
            iA = vl.a.b((rectFI.right - rectFI.left) * iA);
            iP = vl.a.b((rectFI.bottom - rectFI.top) * iP);
        }
        int iU = dVarG1.u();
        if (iU == -90 || iU == 90) {
            int i10 = iP;
            iP = iA;
            iA = i10;
        }
        float f13 = iA / iP;
        qh.h hVarQ0 = bgRatioItem == null ? X().q0() : bgRatioItem;
        if (hVarQ0.l() && X().o1()) {
            strF = sh.b.n(iA, iP, f12);
            fJ = f13;
        } else {
            fJ = hVarQ0.j();
            strF = hVarQ0.f(f12);
        }
        String strN = fJ == f13 ? strF : sh.b.n(iA, iP, fJ);
        q4 q4Var3 = this.binding;
        if (q4Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var3 = null;
        }
        FrameLayout bgContainer = q4Var3.B;
        kotlin.jvm.internal.s.g(bgContainer, "bgContainer");
        sh.b.B(bgContainer, strF);
        q4 q4Var4 = this.binding;
        if (q4Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var4 = null;
        }
        PlayerView playerView = q4Var4.D;
        kotlin.jvm.internal.s.g(playerView, "playerView");
        sh.b.B(playerView, strN);
        wp.a.a("background dimension: " + strF + ", player: " + strN, new Object[0]);
        if (r.N(strF, "W", false, 2, null)) {
            f10 = f11 * fJ;
        } else {
            f11 = f10 / fJ;
        }
        if (r.N(strN, "H", false, 2, null)) {
            this.playerWidth = f10;
            this.playerHeight = f10 / f13;
        } else {
            this.playerHeight = f11;
            this.playerWidth = f11 * f13;
        }
        if (firstFrameRendered) {
            n0(bgRatioItem);
        }
    }

    private final void l0() {
        q4 q4Var = this.binding;
        TextureView textureView = null;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        int width = q4Var.B().getWidth();
        q4 q4Var2 = this.binding;
        if (q4Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var2 = null;
        }
        int height = q4Var2.B().getHeight();
        if (height == 0 || width == 0) {
            return;
        }
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        ng.d dVarG1 = X().g1();
        int iA = dVarG1.A();
        int iP = dVarG1.p();
        int iU = dVarG1.u();
        if (iU == -90 || iU == 90) {
            iP = iA;
            iA = iP;
        }
        String strN = sh.b.n(iA, iP, f12);
        q4 q4Var3 = this.binding;
        if (q4Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var3 = null;
        }
        FrameLayout bgContainer = q4Var3.B;
        kotlin.jvm.internal.s.g(bgContainer, "bgContainer");
        sh.b.B(bgContainer, strN);
        q4 q4Var4 = this.binding;
        if (q4Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var4 = null;
        }
        PlayerView playerView = q4Var4.D;
        kotlin.jvm.internal.s.g(playerView, "playerView");
        sh.b.B(playerView, strN);
        float f13 = iA / iP;
        if (r.N(strN, "W", false, 2, null)) {
            this.playerHeight = f11;
            this.playerWidth = f11 * f13;
        } else {
            this.playerWidth = f10;
            this.playerHeight = f10 / f13;
        }
        Matrix matrix = new Matrix();
        float f14 = this.playerWidth;
        float f15 = this.playerHeight;
        if (iU != -90 && iU != 90) {
            f13 = 1.0f;
        } else if (iA > iP) {
            f15 = f14 * f13;
            f13 = 1 / f13;
        } else {
            f14 = f15 / f13;
        }
        float f16 = 2;
        float f17 = f14 / f16;
        float f18 = f15 / f16;
        matrix.postScale(f13, f13, f17, f18);
        matrix.postRotate(-iU, f17, f18);
        wp.a.a("setup for crop: " + f13 + ", " + f14 + ", " + f15, new Object[0]);
        TextureView textureView2 = this.textureView;
        if (textureView2 == null) {
            kotlin.jvm.internal.s.w("textureView");
            textureView2 = null;
        }
        textureView2.setTransform(matrix);
        TextureView textureView3 = this.textureView;
        if (textureView3 == null) {
            kotlin.jvm.internal.s.w("textureView");
        } else {
            textureView = textureView3;
        }
        textureView.invalidate();
        m0(0.0f, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(qh.h containerRatioItem) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        ng.d dVarG1 = X().g1();
        int iU = dVarG1.u();
        Matrix matrix = new Matrix();
        float fA = dVarG1.A();
        float fP = dVarG1.p();
        float f14 = fA / fP;
        float f15 = this.playerWidth;
        float f16 = this.playerHeight;
        if (f15 / f16 > f14) {
            f16 = f15 / f14;
        } else {
            f15 = f16 * f14;
        }
        wp.a.a("background " + this.playerWidth + ", " + this.playerHeight + " ,surfaceWidth " + f15 + ", " + f16, new Object[0]);
        float f17 = (float) 2;
        float f18 = f15 / f17;
        float f19 = f16 / f17;
        RectF rectFI = dVarG1.i();
        if (rectFI != null) {
            wp.a.a("Crop percentage: " + rectFI, new Object[0]);
            float f20 = rectFI.right;
            float f21 = rectFI.left;
            float f22 = f20 - f21;
            float f23 = rectFI.bottom;
            float f24 = rectFI.top;
            float f25 = f23 - f24;
            f10 = (fA * f22) / (fP * f25);
            if (f10 >= f14) {
                i10 = 1;
                f11 = 1 / f22;
            } else {
                i10 = 1;
                f11 = 1 / f25;
            }
            float f26 = i10;
            f12 = (f15 * (f26 - (f21 + f20))) / f17;
            f13 = (f16 * (f26 - (f24 + f23))) / f17;
            wp.a.a("Crop scale: " + f11, new Object[0]);
        } else {
            if (f14 > 1.0f) {
                f14 = 1 / f14;
            }
            f10 = f14;
            f11 = 1.0f;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        if (iU == -90 || iU == 90) {
            f11 *= f10;
            wp.a.a("Rotate Scale: " + f10, new Object[0]);
        }
        matrix.postTranslate(f12, f13);
        matrix.postScale(f11, f11, f18, f19);
        matrix.postRotate(-iU, f18, f19);
        TextureView textureView = this.textureView;
        q4 q4Var = null;
        if (textureView == null) {
            kotlin.jvm.internal.s.w("textureView");
            textureView = null;
        }
        textureView.setTransform(matrix);
        TextureView textureView2 = this.textureView;
        if (textureView2 == null) {
            kotlin.jvm.internal.s.w("textureView");
            textureView2 = null;
        }
        textureView2.invalidate();
        final qh.b bVarF = dVarG1.f();
        if (containerRatioItem != null || bVarF == null) {
            m0(0.0f, 0.0f, 1.0f);
            return;
        }
        b0(bVarF.a());
        q4 q4Var2 = this.binding;
        if (q4Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            q4Var = q4Var2;
        }
        q4Var.B.post(new Runnable() { // from class: oh.a3
            @Override // java.lang.Runnable
            public final void run() {
                PlayerFragment.o0(this.f48595a, bVarF);
            }
        });
    }

    public static final void o0(PlayerFragment playerFragment, qh.b bVar) {
        playerFragment.m0(bVar.b(), bVar.c(), bVar.e());
    }

    public final lg.a Y() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("preferenceManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        AzRecorderApp.d().c(this);
        this.binding = q4.Y(inflater, container, false);
        X().W0().j(getViewLifecycleOwner(), new com.hecorat.screenrecorder.free.videoeditor.i(new Function1() { // from class: oh.x2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlayerFragment.d0(this.f48902a, (com.google.android.exoplayer2.k) obj);
            }
        }));
        q4 q4Var = this.binding;
        q4 q4Var2 = null;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var = null;
        }
        this.playerWrapper = q4Var.E;
        q4 q4Var3 = this.binding;
        if (q4Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var3 = null;
        }
        View videoSurfaceView = q4Var3.D.getVideoSurfaceView();
        kotlin.jvm.internal.s.f(videoSurfaceView, "null cannot be cast to non-null type android.view.TextureView");
        this.textureView = (TextureView) videoSurfaceView;
        this.surfaceSetupCalled = false;
        q4 q4Var4 = this.binding;
        if (q4Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
            q4Var4 = null;
        }
        q4Var4.B().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: oh.y2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                PlayerFragment.e0(this.f48908a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner).d(new b(null));
        b0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner2).d(new c(null));
        X().G0().j(getViewLifecycleOwner(), new com.hecorat.screenrecorder.free.videoeditor.i(new Function1() { // from class: oh.z2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlayerFragment.f0(this.f48920a, (String) obj);
            }
        }));
        q4 q4Var5 = this.binding;
        if (q4Var5 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            q4Var2 = q4Var5;
        }
        View viewB = q4Var2.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.surfaceSetupCalled = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner).d(new d(null));
        b0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner2).d(new e(null));
        b0 viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner3).d(new f(null));
        b0 viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner4).d(new g(null));
        b0 viewLifecycleOwner5 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner5).d(new h(null));
        b0 viewLifecycleOwner6 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner6).d(new i(null));
        c0();
        lf.i.f44428h.a(lf.l.f44461f.a(lf.l.a.EXPORT), lf.c.f44397g.a(lf.c.a.EXPORT));
    }

    private final void m0(float relX, float relY, float scaleFactor) {
        ConstraintLayout constraintLayout = this.playerWrapper;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout = null;
        }
        q4 q4Var = this.binding;
        String str = qEagQqzJZsd.gmvYNNoLhga;
        if (q4Var == null) {
            kotlin.jvm.internal.s.w(str);
            q4Var = null;
        }
        constraintLayout.setX(relX * q4Var.B.getWidth());
        ConstraintLayout constraintLayout3 = this.playerWrapper;
        if (constraintLayout3 == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout3 = null;
        }
        q4 q4Var2 = this.binding;
        if (q4Var2 == null) {
            kotlin.jvm.internal.s.w(str);
            q4Var2 = null;
        }
        constraintLayout3.setY(relY * q4Var2.B.getHeight());
        ConstraintLayout constraintLayout4 = this.playerWrapper;
        if (constraintLayout4 == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
            constraintLayout4 = null;
        }
        constraintLayout4.setScaleX(scaleFactor);
        ConstraintLayout constraintLayout5 = this.playerWrapper;
        if (constraintLayout5 == null) {
            kotlin.jvm.internal.s.w("playerWrapper");
        } else {
            constraintLayout2 = constraintLayout5;
        }
        constraintLayout2.setScaleY(scaleFactor);
        this.scaleFactor = scaleFactor;
    }
}
