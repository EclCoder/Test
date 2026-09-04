package oh;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 R2\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u001b\u0010!\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001f¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J+\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020+2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0003R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Loh/h1;", "Landroidx/fragment/app/m;", "<init>", "()V", "Lnf/u;", "state", "Lfl/g0;", "K", "(Lnf/u;)V", "", "iconRes", "titleRes", "", "subtitle", "percent", "N", "(IILjava/lang/String;I)V", "O", "(II)V", "", "indeterminate", "M", "(Z)V", "", "bytesRead", "totalBytes", "F", "(JJ)Ljava/lang/String;", "E", "P", "B", "Lkotlin/Function0;", "action", "L", "(Ltl/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "onResume", "onDestroyView", "Ltf/i3;", "a", "Ltf/i3;", "_binding", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Luh/y;", "activityViewModel", "Llf/i;", "c", "Llf/i;", "hybridAdsManager", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ltl/a;", "onCaptionsApplied", "e", "Z", "terminalHandled", "f", "I", "transcribeTarget", "Lem/z1;", "g", "Lem/z1;", "transcribeJob", "H", "()Ltf/i3;", "binding", "h", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private tf.i3 _binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k activityViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new f(this), new g(null, this), new h(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private lf.i hybridAdsManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private tl.a onCaptionsApplied;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean terminalHandled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int transcribeTarget;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private em.z1 transcribeJob;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48680r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f48681s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f48682t;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = h1.this.new b(fVar);
            bVar.f48682t = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        /* JADX WARN: Code duplicated, block: B:13:0x003f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:17:0x004d  */
        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:21:0x0062  */
        /* JADX WARN: Code duplicated, block: B:23:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:14:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x004d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r6.f48681s
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                int r1 = r6.f48680r
                java.lang.Object r3 = r6.f48682t
                em.o0 r3 = (em.o0) r3
                fl.s.b(r7)
                goto L40
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                fl.s.b(r7)
                java.lang.Object r7 = r6.f48682t
                em.o0 r7 = (em.o0) r7
                oh.h1 r1 = oh.h1.this
                int r1 = oh.h1.A(r1)
                r3 = r7
            L2b:
                boolean r7 = em.p0.f(r3)
                if (r7 == 0) goto L93
                r6.f48682t = r3
                r6.f48680r = r1
                r6.f48681s = r2
                r4 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r7 = em.y0.a(r4, r6)
                if (r7 != r0) goto L40
                return r0
            L40:
                oh.h1 r7 = oh.h1.this
                int r7 = oh.h1.A(r7)
                r4 = 95
                if (r7 < r4) goto L4d
                r7 = 99
                goto L53
            L4d:
                oh.h1 r7 = oh.h1.this
                int r7 = oh.h1.A(r7)
            L53:
                oh.h1 r4 = oh.h1.this
                int r4 = oh.h1.A(r4)
                if (r4 <= r1) goto L62
                oh.h1 r7 = oh.h1.this
                int r7 = oh.h1.A(r7)
                goto L68
            L62:
                int r4 = r1 + 1
                int r7 = java.lang.Math.min(r4, r7)
            L68:
                if (r7 == r1) goto L2b
                oh.h1 r1 = oh.h1.this
                tf.i3 r1 = oh.h1.y(r1)
                com.google.android.material.progressindicator.CircularProgressIndicator r1 = r1.G
                r1.r(r7, r2)
                oh.h1 r1 = oh.h1.this
                tf.i3 r1 = oh.h1.y(r1)
                android.widget.TextView r1 = r1.E
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                r5 = 37
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.setText(r4)
                r1 = r7
                goto L2b
            L93:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oh.h1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends androidx.activity.d0 {
        c() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            h1.this.B();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            h1.this.H().A.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            lf.i iVar = h1.this.hybridAdsManager;
            if (iVar != null) {
                iVar.k();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48686a;

        e(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48686a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48686a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48686a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f48687a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48687a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48688a = aVar;
            this.f48689b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48688a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48689b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f48690a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48690a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        new androidx.appcompat.app.c.a(context).e(R.string.caption_cancel_confirm_message).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: oh.f1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h1.C(this.f48657a, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.f22515no, new DialogInterface.OnClickListener() { // from class: oh.g1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h1.D(dialogInterface, i10);
            }
        }).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(h1 h1Var, DialogInterface dialogInterface, int i10) {
        h1Var.G().c0();
        dialogInterface.dismiss();
        h1Var.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void E() {
        if (this.transcribeJob != null) {
            return;
        }
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.transcribeJob = em.k.d(androidx.lifecycle.c0.a(viewLifecycleOwner), null, null, new b(null), 3, null);
    }

    private final String F(long bytesRead, long totalBytes) {
        String string = getString(R.string.caption_download_size_fmt, Double.valueOf(bytesRead / 1048576.0d), Double.valueOf(totalBytes > 0 ? totalBytes / 1048576.0d : 0.0d));
        kotlin.jvm.internal.s.g(string, "getString(...)");
        return string;
    }

    private final uh.y G() {
        return (uh.y) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tf.i3 H() {
        tf.i3 i3Var = this._binding;
        kotlin.jvm.internal.s.e(i3Var);
        return i3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(h1 h1Var, View view) {
        h1Var.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 J(h1 h1Var, nf.u uVar) {
        kotlin.jvm.internal.s.e(uVar);
        h1Var.K(uVar);
        return fl.g0.f38750a;
    }

    private final void K(nf.u state) {
        if (kotlin.jvm.internal.s.c(state, nf.u.d.f47641a)) {
            P();
            H().E.setText("");
            return;
        }
        if (state instanceof nf.u.b) {
            P();
            String string = getString(R.string.caption_phase_downloading_subtitle);
            kotlin.jvm.internal.s.g(string, "getString(...)");
            nf.u.b bVar = (nf.u.b) state;
            N(R.drawable.baseline_download_24, R.string.caption_phase_downloading_title, string, bVar.b());
            H().C.setVisibility(0);
            H().C.setText(F(bVar.a(), bVar.c()));
            return;
        }
        if (kotlin.jvm.internal.s.c(state, nf.u.e.f47642a)) {
            P();
            O(R.drawable.ic_magic_button_outline, R.string.caption_phase_installing_title);
            return;
        }
        if (state instanceof nf.u.g) {
            P();
            String string2 = getString(R.string.caption_phase_preparing_subtitle);
            kotlin.jvm.internal.s.g(string2, "getString(...)");
            N(R.drawable.ic_microphone_outline, R.string.caption_phase_preparing_title, string2, ((nf.u.g) state).a());
            H().C.setVisibility(8);
            return;
        }
        if (kotlin.jvm.internal.s.c(state, nf.u.f.f47643a)) {
            P();
            O(R.drawable.ic_magic_button_outline, R.string.caption_phase_loading_title);
            return;
        }
        if (state instanceof nf.u.h) {
            H().F.setImageResource(R.drawable.ic_closed_caption_24);
            H().J.setText(R.string.caption_phase_transcribing_title);
            H().I.setText("");
            H().C.setVisibility(8);
            M(false);
            H().E.setVisibility(0);
            this.transcribeTarget = yl.g.i(((nf.u.h) state).a(), 0, 95);
            if (this.transcribeJob == null) {
                H().G.r(this.transcribeTarget, false);
                TextView textView = H().E;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.transcribeTarget);
                sb2.append('%');
                textView.setText(sb2.toString());
            }
            E();
            return;
        }
        if (kotlin.jvm.internal.s.c(state, nf.u.a.f47636a)) {
            if (this.terminalHandled) {
                return;
            }
            this.terminalHandled = true;
            P();
            tl.a aVar = this.onCaptionsApplied;
            if (aVar != null) {
                aVar.invoke();
            }
            dismissAllowingStateLoss();
            return;
        }
        if (!(state instanceof nf.u.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.terminalHandled) {
            return;
        }
        this.terminalHandled = true;
        P();
        nh.j0.b(getContext(), ((nf.u.c) state).a());
        dismissAllowingStateLoss();
    }

    private final void M(boolean indeterminate) {
        CircularProgressIndicator progressBar = H().G;
        kotlin.jvm.internal.s.g(progressBar, "progressBar");
        if (progressBar.isIndeterminate() == indeterminate) {
            return;
        }
        progressBar.setVisibility(8);
        progressBar.setIndeterminate(indeterminate);
        progressBar.setVisibility(0);
    }

    private final void N(int iconRes, int titleRes, String subtitle, int percent) {
        H().F.setImageResource(iconRes);
        H().J.setText(titleRes);
        H().I.setText(subtitle);
        M(false);
        H().E.setVisibility(0);
        H().G.r(percent, true);
        TextView textView = H().E;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(percent);
        sb2.append('%');
        textView.setText(sb2.toString());
    }

    private final void O(int iconRes, int titleRes) {
        H().F.setImageResource(iconRes);
        H().J.setText(titleRes);
        H().I.setText("");
        H().C.setVisibility(8);
        H().E.setVisibility(8);
        M(true);
    }

    private final void P() {
        em.z1 z1Var = this.transcribeJob;
        if (z1Var != null) {
            em.z1.c0(z1Var, null, 1, null);
        }
        this.transcribeJob = null;
    }

    public final void L(tl.a action) {
        kotlin.jvm.internal.s.h(action, "action");
        this.onCaptionsApplied = action;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.FullScreenDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        this._binding = tf.i3.Y(inflater, container, false);
        View viewB = H().B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        P();
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.h();
        }
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        H().B.setOnClickListener(new View.OnClickListener() { // from class: oh.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h1.I(this.f48644a, view2);
            }
        });
        Dialog dialog = getDialog();
        kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type androidx.activity.ComponentDialog");
        androidx.activity.i0 onBackPressedDispatcher = ((androidx.activity.w) dialog).getOnBackPressedDispatcher();
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new c());
        G().w0().j(getViewLifecycleOwner(), new e(new Function1() { // from class: oh.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.J(this.f48652a, (nf.u) obj);
            }
        }));
        if (nh.l0.o()) {
            return;
        }
        lf.i iVar = new lf.i(lf.l.f44461f.a(lf.l.a.CAPTION), lf.c.f44397g.a(lf.c.a.CAPTION), H().A, H().D.G, null, true, 16, null);
        this.hybridAdsManager = iVar;
        iVar.i();
        H().A.getViewTreeObserver().addOnGlobalLayoutListener(new d());
    }
}
