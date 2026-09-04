package oh;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0004R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Loh/l2;", "Landroidx/fragment/app/m;", "Llf/n$c;", "<init>", "()V", "", "y", "()Z", "Lfl/g0;", "v", "B", "Lnf/e0;", "row", "z", "(Lnf/e0;)V", "D", "Lkotlin/Function1;", "", "callback", "C", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "h", "f", "onDestroyView", "Ltf/g2;", "a", "Ltf/g2;", "_binding", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", "w", "()Luh/y;", "activityViewModel", "Lnf/c0;", "c", "Lnf/c0;", "adapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "showAll", "e", "Lkotlin/jvm/functions/Function1;", "onLanguageSelected", "Ljava/lang/String;", "pendingCode", "Llf/n;", "g", "Llf/n;", "rewardedAdsManager", "x", "()Ltf/g2;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l2 extends androidx.fragment.app.m implements lf.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private tf.g2 _binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k activityViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new c(this), new d(null, this), new e(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private nf.c0 adapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean showAll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function1 onLanguageSelected;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String pendingCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private lf.n rewardedAdsManager;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    /* synthetic */ class b extends kotlin.jvm.internal.p implements Function1 {
        b(Object obj) {
            super(1, obj, l2.class, "onRowClick", "onRowClick(Lcom/hecorat/screenrecorder/free/captions/LanguageRow;)V", 0);
        }

        public final void b(nf.e0 p10) {
            kotlin.jvm.internal.s.h(p10, "p0");
            ((l2) this.receiver).z(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((nf.e0) obj);
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f48723a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48723a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48725b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48724a = aVar;
            this.f48725b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48724a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48725b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f48726a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48726a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(l2 l2Var, View view) {
        l2Var.dismiss();
    }

    private final void B() {
        List listB = this.showAll ? nf.r.f47620a.b() : nf.r.f47620a.c();
        List listC = gl.r.c();
        String string = getString(R.string.caption_lang_auto);
        kotlin.jvm.internal.s.g(string, "getString(...)");
        listC.add(new nf.e0(new nf.q("", string)));
        List list = listB;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new nf.e0((nf.q) it.next()));
        }
        listC.addAll(arrayList);
        if (!this.showAll) {
            String string2 = getString(R.string.caption_show_all_languages);
            kotlin.jvm.internal.s.g(string2, "getString(...)");
            listC.add(new nf.e0(new nf.q("__show_all__", string2)));
        }
        List listA = gl.r.a(listC);
        nf.c0 c0Var = this.adapter;
        if (c0Var == null) {
            kotlin.jvm.internal.s.w("adapter");
            c0Var = null;
        }
        c0Var.i(listA);
    }

    private final void D() {
        androidx.fragment.app.f0 supportFragmentManager;
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || supportFragmentManager.k0("upgrade_or_watch_ads_caption") != null) {
            return;
        }
        new wf.h0("auto_caption").show(supportFragmentManager, "upgrade_or_watch_ads_caption");
    }

    private final void v() {
        if (y()) {
            x().C.setVisibility(8);
            return;
        }
        x().C.setText(R.string.caption_pro_footer);
        x().C.setVisibility(0);
        lf.n nVarA = lf.n.f44484g.a(lf.n.a.AUTO_CAPTION);
        nVarA.o(this);
        nVarA.m();
        this.rewardedAdsManager = nVarA;
    }

    private final uh.y w() {
        return (uh.y) this.activityViewModel.getValue();
    }

    private final tf.g2 x() {
        tf.g2 g2Var = this._binding;
        kotlin.jvm.internal.s.e(g2Var);
        return g2Var;
    }

    private final boolean y() {
        return nh.l0.o() || w().y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(nf.e0 row) {
        String strA = row.a().a();
        if (kotlin.jvm.internal.s.c(strA, "__show_all__")) {
            this.showAll = true;
            B();
        } else if (!y()) {
            this.pendingCode = strA;
            D();
        } else {
            Function1 function1 = this.onLanguageSelected;
            if (function1 != null) {
                function1.invoke(strA);
            }
            dismiss();
        }
    }

    public final void C(Function1 callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        this.onLanguageSelected = callback;
    }

    @Override // lf.n.c
    public void f() {
    }

    @Override // lf.n.c
    public void h() {
        if (this._binding == null) {
            return;
        }
        w().Y1(true);
        x().C.setVisibility(8);
        String str = this.pendingCode;
        if (str == null) {
            return;
        }
        Object obj = null;
        this.pendingCode = null;
        nf.c0 c0Var = this.adapter;
        if (c0Var == null) {
            kotlin.jvm.internal.s.w("adapter");
            c0Var = null;
        }
        List listF = c0Var.f();
        kotlin.jvm.internal.s.g(listF, "getCurrentList(...)");
        for (Object obj2 : listF) {
            if (kotlin.jvm.internal.s.c(((nf.e0) obj2).a().a(), str)) {
                obj = obj2;
                break;
            }
        }
        nf.e0 e0Var = (nf.e0) obj;
        if (e0Var == null) {
            return;
        }
        z(e0Var);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, android.R.style.Theme.Black.NoTitleBar);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        kotlin.jvm.internal.s.g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        lf.n nVar = this.rewardedAdsManager;
        if (nVar != null) {
            nVar.l();
        }
        this.rewardedAdsManager = null;
        this._binding = null;
        this.onLanguageSelected = null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.adapter = new nf.c0(new b(this));
        x().B.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView = x().B;
        nf.c0 c0Var = this.adapter;
        if (c0Var == null) {
            kotlin.jvm.internal.s.w("adapter");
            c0Var = null;
        }
        recyclerView.setAdapter(c0Var);
        x().A.setOnClickListener(new View.OnClickListener() { // from class: oh.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l2.A(this.f48709a, view2);
            }
        });
        v();
        B();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        this._binding = tf.g2.Y(inflater, container, false);
        View viewB = x().B();
        kotlin.jvm.internal.s.g(viewB, lkCBSIFlvmyGX.nKb);
        return viewB;
    }
}
