package oh;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.xw.repo.BubbleSeekBar;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import tf.o5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Loh/q4;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", "v", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "", "", "a", "Ljava/util/List;", "frameRateList", "Ltf/o5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ltf/o5;", "binding", "Luh/y;", "c", "Lfl/k;", "u", "()Luh/y;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q4 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private o5 binding;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List frameRateList = gl.r.o(24, 25, 30, 50, 60);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fl.k viewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new c(this), new d(null, this), new e(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48823a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f48823a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48823a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48825b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48824a = aVar;
            this.f48825b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48824a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48825b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f48826a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48826a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh.y u() {
        return (uh.y) this.viewModel.getValue();
    }

    private final void v() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        o5 o5Var = this.binding;
        o5 o5Var2 = null;
        if (o5Var == null) {
            kotlin.jvm.internal.s.w("binding");
            o5Var = null;
        }
        BubbleSeekBar resolutionBsb = o5Var.C;
        kotlin.jvm.internal.s.g(resolutionBsb, "resolutionBsb");
        Object objF = u().d1().f();
        kotlin.jvm.internal.s.e(objF);
        sh.b.f(contextRequireContext, resolutionBsb, ((Number) objF).intValue(), sh.b.u());
        o5 o5Var3 = this.binding;
        if (o5Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            o5Var3 = null;
        }
        o5Var3.C.setOnProgressChangedListener(new a());
        int size = this.frameRateList.size();
        List list = this.frameRateList;
        Object objF2 = u().P0().f();
        kotlin.jvm.internal.s.e(objF2);
        float fIndexOf = list.indexOf(objF2);
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext2, "requireContext(...)");
        o5 o5Var4 = this.binding;
        if (o5Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
            o5Var4 = null;
        }
        BubbleSeekBar frameRateBsb = o5Var4.A;
        kotlin.jvm.internal.s.g(frameRateBsb, "frameRateBsb");
        sh.b.h(contextRequireContext2, frameRateBsb, size - 1, fIndexOf, size - 1);
        o5 o5Var5 = this.binding;
        if (o5Var5 == null) {
            kotlin.jvm.internal.s.w("binding");
            o5Var5 = null;
        }
        o5Var5.A.setCustomSectionTextArray(new BubbleSeekBar.j() { // from class: oh.p4
            @Override // com.xw.repo.BubbleSeekBar.j
            public final SparseArray a(int i10, SparseArray sparseArray) {
                return q4.w(this.f48780a, i10, sparseArray);
            }
        });
        o5 o5Var6 = this.binding;
        if (o5Var6 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            o5Var2 = o5Var6;
        }
        o5Var2.A.setOnProgressChangedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseArray w(q4 q4Var, int i10, SparseArray array) {
        kotlin.jvm.internal.s.h(array, "array");
        array.clear();
        int i11 = 0;
        for (Object obj : q4Var.frameRateList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                gl.r.u();
            }
            array.put(i11, String.valueOf(((Number) obj).intValue()));
            i11 = i12;
        }
        return array;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        o5 o5VarY = o5.Y(getLayoutInflater());
        this.binding = o5VarY;
        o5 o5Var = null;
        if (o5VarY == null) {
            kotlin.jvm.internal.s.w("binding");
            o5VarY = null;
        }
        o5VarY.S(this);
        o5 o5Var2 = this.binding;
        if (o5Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            o5Var2 = null;
        }
        o5Var2.a0(u());
        v();
        o5 o5Var3 = this.binding;
        if (o5Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            o5Var = o5Var3;
        }
        View viewB = o5Var.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o5 o5Var = this.binding;
        if (o5Var == null) {
            kotlin.jvm.internal.s.w("binding");
            o5Var = null;
        }
        o5Var.B().requestLayout();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements BubbleSeekBar.k {
        a() {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void b(BubbleSeekBar bubbleSeekBar, int i10, float f10) {
            int iIntValue = ((Number) sh.b.u().get(i10)).intValue();
            q4.this.u().d1().q(Integer.valueOf(iIntValue));
            androidx.lifecycle.p0 p0VarU0 = q4.this.u().U0();
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format("%sp", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
            kotlin.jvm.internal.s.g(str, "format(...)");
            p0VarU0.q(str);
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void c(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements BubbleSeekBar.k {
        b() {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void b(BubbleSeekBar bubbleSeekBar, int i10, float f10) {
            q4.this.u().P0().q(q4.this.frameRateList.get(i10));
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void c(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }
    }
}
