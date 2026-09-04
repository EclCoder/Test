package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.xiaopo.flying.sticker.StickerView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Loh/q3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "position", "Lfl/g0;", "A", "(J)V", "", "Lqh/i;", "itemList", "v", "(Ljava/util/List;J)V", "", "isRewardEarned", "B", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luh/y;", "a", "Lfl/k;", "w", "()Luh/y;", "activityViewModel", "Ltf/u4;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ltf/u4;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q3 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k activityViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new b(this), new c(null, this), new d(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private tf.u4 binding;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48813a;

        a(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48813a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48813a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48813a.invoke(obj);
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
    public static final class b extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f48814a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48814a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48815a = aVar;
            this.f48816b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48815a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48816b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48817a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48817a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48817a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final void A(long position) {
        wp.a.a("Change position in preview", new Object[0]);
        HashSet hashSet = new HashSet(w().i1().size() + w().H0().size());
        Iterator it = w().i1().iterator();
        while (it.hasNext()) {
            hashSet.add(((qh.j) it.next()).getId());
        }
        Iterator it2 = w().H0().iterator();
        while (it2.hasNext()) {
            hashSet.add(((qh.c) it2.next()).getId());
        }
        tf.u4 u4Var = this.binding;
        if (u4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            u4Var = null;
        }
        List<bk.h> stickers = u4Var.A.getStickers();
        kotlin.jvm.internal.s.g(stickers, "getStickers(...)");
        for (bk.h hVar : gl.r.I0(stickers)) {
            if (!hashSet.contains(hVar.j())) {
                tf.u4 u4Var2 = this.binding;
                if (u4Var2 == null) {
                    kotlin.jvm.internal.s.w("binding");
                    u4Var2 = null;
                }
                u4Var2.A.A(hVar);
            }
        }
        v(w().i1(), position);
        v(w().H0(), position);
    }

    private final void B(boolean isRewardEarned) {
        tf.u4 u4Var = null;
        if (nh.l0.o() || isRewardEarned) {
            tf.u4 u4Var2 = this.binding;
            if (u4Var2 == null) {
                kotlin.jvm.internal.s.w("binding");
            } else {
                u4Var = u4Var2;
            }
            u4Var.B.setVisibility(8);
            return;
        }
        tf.u4 u4Var3 = this.binding;
        if (u4Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            u4Var3 = null;
        }
        u4Var3.B.setVisibility(0);
        tf.u4 u4Var4 = this.binding;
        if (u4Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            u4Var = u4Var4;
        }
        u4Var.B.setOnClickListener(new View.OnClickListener() { // from class: oh.p3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q3.C(this.f48779a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(q3 q3Var, View view) {
        wf.h0 h0Var = new wf.h0("remove_watermark");
        androidx.fragment.app.s activity = q3Var.getActivity();
        if (activity != null) {
            h0Var.show(activity.getSupportFragmentManager(), "upgrade or watch ad dialog");
        }
    }

    private final void v(List itemList, long position) {
        Iterator it = itemList.iterator();
        while (it.hasNext()) {
            qh.i iVar = (qh.i) it.next();
            tf.u4 u4Var = this.binding;
            tf.u4 u4Var2 = null;
            if (u4Var == null) {
                kotlin.jvm.internal.s.w("binding");
                u4Var = null;
            }
            List<bk.h> stickers = u4Var.A.getStickers();
            kotlin.jvm.internal.s.g(stickers, "getStickers(...)");
            for (bk.h hVar : gl.r.I0(stickers)) {
                if (kotlin.jvm.internal.s.c(hVar.j(), iVar.getId()) && (iVar.c() > position || position > iVar.c() + iVar.b())) {
                    tf.u4 u4Var3 = this.binding;
                    if (u4Var3 == null) {
                        kotlin.jvm.internal.s.w("binding");
                        u4Var3 = null;
                    }
                    u4Var3.A.A(hVar);
                }
            }
            if (iVar.c() <= position && position <= iVar.c() + iVar.b()) {
                tf.u4 u4Var4 = this.binding;
                if (u4Var4 == null) {
                    kotlin.jvm.internal.s.w("binding");
                    u4Var4 = null;
                }
                StickerView stickerView = u4Var4.A;
                kotlin.jvm.internal.s.g(stickerView, "stickerView");
                tf.u4 u4Var5 = this.binding;
                if (u4Var5 == null) {
                    kotlin.jvm.internal.s.w("binding");
                    u4Var5 = null;
                }
                float width = u4Var5.A.getWidth();
                tf.u4 u4Var6 = this.binding;
                if (u4Var6 == null) {
                    kotlin.jvm.internal.s.w("binding");
                } else {
                    u4Var2 = u4Var6;
                }
                sh.b.c(stickerView, iVar, width, u4Var2.A.getHeight());
            }
        }
    }

    private final uh.y w() {
        return (uh.y) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final q3 q3Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onViewCreated PreviewOverlayFragment ");
        tf.u4 u4Var = q3Var.binding;
        tf.u4 u4Var2 = null;
        if (u4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            u4Var = null;
        }
        sb2.append(u4Var.A.getWidth());
        sb2.append(", ");
        tf.u4 u4Var3 = q3Var.binding;
        if (u4Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            u4Var2 = u4Var3;
        }
        sb2.append(u4Var2.A.getHeight());
        wp.a.a(sb2.toString(), new Object[0]);
        q3Var.w().X0().j(q3Var.getViewLifecycleOwner(), new a(new Function1() { // from class: oh.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q3.y(this.f48765a, (Long) obj);
            }
        }));
        q3Var.w().q1().j(q3Var.getViewLifecycleOwner(), new a(new Function1() { // from class: oh.o3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q3.z(this.f48774a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 y(q3 q3Var, Long l10) {
        kotlin.jvm.internal.s.e(l10);
        q3Var.A(l10.longValue());
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 z(q3 q3Var, Boolean bool) {
        kotlin.jvm.internal.s.e(bool);
        q3Var.B(bool.booleanValue());
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        tf.u4 u4VarY = tf.u4.Y(inflater, container, false);
        this.binding = u4VarY;
        if (u4VarY == null) {
            kotlin.jvm.internal.s.w("binding");
            u4VarY = null;
        }
        View viewB = u4VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        tf.u4 u4Var = this.binding;
        if (u4Var == null) {
            kotlin.jvm.internal.s.w("binding");
            u4Var = null;
        }
        u4Var.A.post(new Runnable() { // from class: oh.m3
            @Override // java.lang.Runnable
            public final void run() {
                q3.x(this.f48733a);
            }
        });
    }
}
