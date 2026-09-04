package com.hecorat.screenrecorder.free.videoeditor;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.s1;
import androidx.lifecycle.u1;
import com.google.android.exoplayer2.x1;
import com.google.android.exoplayer2.y0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.AudioRangeSeekBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.o;
import kotlin.Metadata;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import n0.e0;
import nh.j0;
import ob.r0;
import tf.t1;
import uh.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/c;", "Landroidx/fragment/app/m;", "Lcom/hecorat/screenrecorder/free/videoeditor/view/AudioRangeSeekBar$b;", "<init>", "()V", "Lfl/g0;", "D", "B", "I", "", "startTime", "endTime", "K", "(JJ)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "onResume", "onPause", "onStop", "Lcom/hecorat/screenrecorder/free/videoeditor/c$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "J", "(Lcom/hecorat/screenrecorder/free/videoeditor/c$a;)V", "a", "pos", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(J)V", "Luh/y;", "Lfl/k;", "A", "()Luh/y;", "activityViewModel", "Luh/d;", "C", "()Luh/d;", "dialogViewModel", "Ltf/t1;", "c", "Ltf/t1;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/hecorat/screenrecorder/free/videoeditor/c$a;", "Lcom/google/android/exoplayer2/k;", "e", "Lcom/google/android/exoplayer2/k;", "audioPlayer", "Lqh/a;", "f", "Lqh/a;", "audioItem", "Landroid/os/Handler;", "g", "Landroid/os/Handler;", "uiHandler", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends androidx.fragment.app.m implements AudioRangeSeekBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final fl.k activityViewModel = t0.b(this, l0.b(y.class), new d(this), new e(null, this), new f(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final fl.k dialogViewModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public t1 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.google.android.exoplayer2.k audioPlayer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public qh.a audioItem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Handler uiHandler;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        void g(qh.a aVar);

        void o(qh.a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements x1.d {
        public b() {
        }

        @Override // com.google.android.exoplayer2.x1.d
        public void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
            if (z10) {
                c.this.B();
            }
        }
    }

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class RunnableC0342c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f23391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f23392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f23393c;

        public RunnableC0342c(View view, c cVar, k0 k0Var) {
            this.f23391a = view;
            this.f23392b = cVar;
            this.f23393c = k0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int dimensionPixelSize = this.f23392b.getResources().getDimensionPixelSize(R.dimen.trim_left_right_margin) / 2;
            int dimensionPixelSize2 = this.f23392b.getResources().getDimensionPixelSize(R.dimen.audio_trim_seek_bar_vertical_margin);
            t1 t1Var = this.f23392b.binding;
            t1 t1Var2 = null;
            if (t1Var == null) {
                s.w("binding");
                t1Var = null;
            }
            int width = t1Var.M.getWidth() - dimensionPixelSize;
            t1 t1Var3 = this.f23392b.binding;
            if (t1Var3 == null) {
                s.w("binding");
                t1Var3 = null;
            }
            int height = t1Var3.M.getHeight() - dimensionPixelSize2;
            t1 t1Var4 = this.f23392b.binding;
            if (t1Var4 == null) {
                s.w("binding");
                t1Var4 = null;
            }
            t1Var4.M.t(((qh.a) this.f23393c.f43597a).h(), dimensionPixelSize, width, dimensionPixelSize2, height, this.f23392b);
            t1 t1Var5 = this.f23392b.binding;
            if (t1Var5 == null) {
                s.w("binding");
                t1Var5 = null;
            }
            t1Var5.M.s(((qh.a) this.f23393c.f43597a).k(), ((qh.a) this.f23393c.f43597a).j());
            t1 t1Var6 = this.f23392b.binding;
            if (t1Var6 == null) {
                s.w("binding");
            } else {
                t1Var2 = t1Var6;
            }
            t1Var2.M.v(((qh.a) this.f23393c.f43597a).k());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f23394a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f23394a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23395a = aVar;
            this.f23396b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23395a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23396b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f23397a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23397a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23398a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f23398a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f23398a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.a aVar) {
            super(0);
            this.f23399a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23399a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fl.k f23400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(fl.k kVar) {
            super(0);
            this.f23400a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            return t0.c(this.f23400a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tl.a aVar, fl.k kVar) {
            super(0);
            this.f23401a = aVar;
            this.f23402b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23401a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23402b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class k extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment, fl.k kVar) {
            super(0);
            this.f23403a = fragment;
            this.f23404b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory;
            u1 u1VarC = t0.c(this.f23404b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            s1.c defaultViewModelProviderFactory2 = this.f23403a.getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public c() {
        fl.k kVarA = fl.l.a(o.NONE, new h(new g(this)));
        this.dialogViewModel = t0.b(this, l0.b(uh.d.class), new i(kVarA), new j(null, kVarA), new k(this, kVarA));
        this.uiHandler = new Handler(Looper.getMainLooper());
    }

    private final y A() {
        return (y) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        com.google.android.exoplayer2.k kVar = this.audioPlayer;
        Object objF = C().m().f();
        if (kVar == null || objF == null) {
            return;
        }
        long jLongValue = ((Number) objF).longValue();
        if (kVar.isPlaying()) {
            long currentPosition = jLongValue + kVar.getCurrentPosition();
            t1 t1Var = this.binding;
            t1 t1Var2 = null;
            if (t1Var == null) {
                s.w("binding");
                t1Var = null;
            }
            t1Var.M.v(currentPosition);
            t1 t1Var3 = this.binding;
            if (t1Var3 == null) {
                s.w("binding");
            } else {
                t1Var2 = t1Var3;
            }
            t1Var2.C.setText(nh.l0.c(currentPosition));
            wp.a.a("Current audio position: " + kVar.getCurrentPosition(), new Object[0]);
            this.uiHandler.postDelayed(new Runnable() { // from class: oh.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48662a.B();
                }
            }, 100L);
        }
    }

    private final uh.d C() {
        return (uh.d) this.dialogViewModel.getValue();
    }

    private final void D() {
        if (this.audioPlayer == null) {
            this.audioPlayer = new com.google.android.exoplayer2.k.b(requireContext()).e();
        }
        com.google.android.exoplayer2.k kVar = this.audioPlayer;
        t1 t1Var = null;
        if (kVar != null) {
            qh.a aVar = this.audioItem;
            if (aVar == null) {
                s.w("audioItem");
                aVar = null;
            }
            kVar.setVolume(aVar.m());
        }
        com.google.android.exoplayer2.k kVar2 = this.audioPlayer;
        if (kVar2 != null) {
            kVar2.setPlayWhenReady(false);
        }
        com.google.android.exoplayer2.k kVar3 = this.audioPlayer;
        if (kVar3 != null) {
            kVar3.E(new b());
        }
        qh.a aVar2 = this.audioItem;
        if (aVar2 == null) {
            s.w("audioItem");
            aVar2 = null;
        }
        long jK = aVar2.k();
        qh.a aVar3 = this.audioItem;
        if (aVar3 == null) {
            s.w("audioItem");
            aVar3 = null;
        }
        K(jK, aVar3.j());
        t1 t1Var2 = this.binding;
        if (t1Var2 == null) {
            s.w("binding");
        } else {
            t1Var = t1Var2;
        }
        t1Var.K.setPlayer(this.audioPlayer);
    }

    public static final void E(AlertDialog alertDialog, View view) {
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public static final void F(c cVar, k0 k0Var, AlertDialog alertDialog, View view) {
        a aVar = cVar.listener;
        if (aVar != null) {
            aVar.g((qh.a) k0Var.f43597a);
        }
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public static final void G(c cVar, k0 k0Var, AlertDialog alertDialog, View view) {
        Long l10 = (Long) cVar.C().m().f();
        Long l11 = (Long) cVar.C().l().f();
        if (l10 == null || l11 == null) {
            return;
        }
        if (l11.longValue() - l10.longValue() <= 0) {
            j0.b(cVar.getContext(), R.string.toast_music_duration_must_not_be_0);
            return;
        }
        qh.a aVar = (qh.a) k0Var.f43597a;
        t1 t1Var = cVar.binding;
        t1 t1Var2 = null;
        if (t1Var == null) {
            s.w("binding");
            t1Var = null;
        }
        aVar.q(t1Var.I.getValue());
        qh.a aVar2 = (qh.a) k0Var.f43597a;
        t1 t1Var3 = cVar.binding;
        if (t1Var3 == null) {
            s.w("binding");
        } else {
            t1Var2 = t1Var3;
        }
        aVar2.n(t1Var2.G.isChecked());
        ((qh.a) k0Var.f43597a).p(l10.longValue());
        ((qh.a) k0Var.f43597a).o(l11.longValue());
        a aVar3 = cVar.listener;
        if (aVar3 != null) {
            aVar3.o((qh.a) k0Var.f43597a);
        }
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public static final void H(c cVar, Slider slider, float f10, boolean z10) {
        s.h(slider, "slider");
        com.google.android.exoplayer2.k kVar = cVar.audioPlayer;
        if (kVar != null) {
            kVar.setVolume(f10);
        }
        wp.a.a("New volume: " + f10, new Object[0]);
    }

    private final void I() {
        com.google.android.exoplayer2.k kVar = this.audioPlayer;
        if (kVar != null) {
            kVar.release();
        }
        this.audioPlayer = null;
    }

    private final void K(long startTime, long endTime) {
        y0.d dVarF = new y0.d.a().k(startTime).h(endTime).f();
        s.g(dVarF, "build(...)");
        y0.c cVar = new y0.c();
        qh.a aVar = this.audioItem;
        if (aVar == null) {
            s.w("audioItem");
            aVar = null;
        }
        y0 y0VarA = cVar.g(aVar.l()).b(dVarF).a();
        s.g(y0VarA, "build(...)");
        com.google.android.exoplayer2.k kVar = this.audioPlayer;
        if (kVar != null) {
            kVar.A(y0VarA);
        }
        com.google.android.exoplayer2.k kVar2 = this.audioPlayer;
        if (kVar2 != null) {
            kVar2.a();
        }
    }

    public final void J(a listener) {
        s.h(listener, "listener");
        this.listener = listener;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.AudioRangeSeekBar.b
    public void a(long startTime, long endTime) {
        C().n(startTime, endTime);
        K(startTime, endTime);
        com.google.android.exoplayer2.k kVar = this.audioPlayer;
        if (kVar != null) {
            kVar.seekTo(0L);
        }
        com.google.android.exoplayer2.k kVar2 = this.audioPlayer;
        if (kVar2 != null) {
            kVar2.setPlayWhenReady(false);
        }
        t1 t1Var = this.binding;
        t1 t1Var2 = null;
        if (t1Var == null) {
            s.w("binding");
            t1Var = null;
        }
        t1Var.M.v(startTime);
        t1 t1Var3 = this.binding;
        if (t1Var3 == null) {
            s.w("binding");
        } else {
            t1Var2 = t1Var3;
        }
        t1Var2.C.setText(nh.l0.c(startTime));
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.AudioRangeSeekBar.b
    public void b(long pos) {
        com.google.android.exoplayer2.k kVar = this.audioPlayer;
        Object objF = C().m().f();
        if (kVar != null && objF != null) {
            long jLongValue = ((Number) objF).longValue();
            kVar.setPlayWhenReady(false);
            long j10 = pos - jLongValue;
            if (j10 <= 0) {
                j10 = 0;
            }
            kVar.seekTo(j10);
            t1 t1Var = this.binding;
            if (t1Var == null) {
                s.w("binding");
                t1Var = null;
            }
            t1Var.C.setText(nh.l0.c(pos));
        }
        wp.a.a("Audio seek to pos: " + pos, new Object[0]);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String string;
        t1 t1VarY = t1.Y(getLayoutInflater());
        this.binding = t1VarY;
        t1 t1Var = null;
        if (t1VarY == null) {
            s.w("binding");
            t1VarY = null;
        }
        t1VarY.S(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        t1 t1Var2 = this.binding;
        if (t1Var2 == null) {
            s.w("binding");
            t1Var2 = null;
        }
        builder.setView(t1Var2.B());
        final AlertDialog alertDialogCreate = builder.create();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("audio_item_id")) == null) {
            Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
            s.g(dialogOnCreateDialog, "onCreateDialog(...)");
            return dialogOnCreateDialog;
        }
        final k0 k0Var = new k0();
        for (qh.a aVar : A().p0()) {
            if (s.c(aVar.getId(), string)) {
                k0Var.f43597a = aVar;
            }
        }
        qh.a aVar2 = (qh.a) k0Var.f43597a;
        if (aVar2 == null) {
            Dialog dialogOnCreateDialog2 = super.onCreateDialog(savedInstanceState);
            s.g(dialogOnCreateDialog2, "onCreateDialog(...)");
            return dialogOnCreateDialog2;
        }
        k0Var.f43597a = aVar2;
        this.audioItem = aVar2;
        uh.d dVarC = C();
        qh.a aVar3 = this.audioItem;
        if (aVar3 == null) {
            s.w("audioItem");
            aVar3 = null;
        }
        long jK = aVar3.k();
        qh.a aVar4 = this.audioItem;
        if (aVar4 == null) {
            s.w("audioItem");
            aVar4 = null;
        }
        dVarC.n(jK, aVar4.j());
        t1 t1Var3 = this.binding;
        if (t1Var3 == null) {
            s.w("binding");
            t1Var3 = null;
        }
        t1Var3.I.setValue(((qh.a) k0Var.f43597a).m());
        t1 t1Var4 = this.binding;
        if (t1Var4 == null) {
            s.w("binding");
            t1Var4 = null;
        }
        t1Var4.G.setChecked(((qh.a) k0Var.f43597a).g());
        t1 t1Var5 = this.binding;
        if (t1Var5 == null) {
            s.w("binding");
            t1Var5 = null;
        }
        t1Var5.A.setOnClickListener(new View.OnClickListener() { // from class: oh.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.hecorat.screenrecorder.free.videoeditor.c.E(alertDialogCreate, view);
            }
        });
        t1 t1Var6 = this.binding;
        if (t1Var6 == null) {
            s.w("binding");
            t1Var6 = null;
        }
        t1Var6.D.setOnClickListener(new View.OnClickListener() { // from class: oh.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.hecorat.screenrecorder.free.videoeditor.c.F(this.f48641a, k0Var, alertDialogCreate, view);
            }
        });
        t1 t1Var7 = this.binding;
        if (t1Var7 == null) {
            s.w("binding");
            t1Var7 = null;
        }
        t1Var7.B.setOnClickListener(new View.OnClickListener() { // from class: oh.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.hecorat.screenrecorder.free.videoeditor.c.G(this.f48649a, k0Var, alertDialogCreate, view);
            }
        });
        t1 t1Var8 = this.binding;
        if (t1Var8 == null) {
            s.w("binding");
            t1Var8 = null;
        }
        t1Var8.I.m(new com.google.android.material.slider.a() { // from class: oh.f0
            @Override // com.google.android.material.slider.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Slider slider, float f10, boolean z10) {
                com.hecorat.screenrecorder.free.videoeditor.c.H(this.f48656a, slider, f10, z10);
            }
        });
        t1 t1Var9 = this.binding;
        if (t1Var9 == null) {
            s.w("binding");
            t1Var9 = null;
        }
        t1Var9.C.setText(nh.l0.c(0L));
        t1 t1Var10 = this.binding;
        if (t1Var10 == null) {
            s.w("binding");
            t1Var10 = null;
        }
        t1Var10.E.setText(nh.l0.c(((qh.a) k0Var.f43597a).h()));
        t1 t1Var11 = this.binding;
        if (t1Var11 == null) {
            s.w("binding");
        } else {
            t1Var = t1Var11;
        }
        AudioRangeSeekBar rangeSeekBar = t1Var.M;
        s.g(rangeSeekBar, "rangeSeekBar");
        e0.a(rangeSeekBar, new RunnableC0342c(rangeSeekBar, this, k0Var));
        s.e(alertDialogCreate);
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.uiHandler.removeCallbacksAndMessages(null);
        if (r0.f48425a <= 23) {
            I();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (r0.f48425a <= 23) {
            D();
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (r0.f48425a > 23) {
            D();
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.uiHandler.removeCallbacksAndMessages(null);
        if (r0.f48425a > 23) {
            I();
        }
    }
}
