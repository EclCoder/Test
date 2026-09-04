package fh;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fl.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0015\u001a\u00020\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfh/q;", "Lyg/a;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/databinding/p;", "x", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "Lfl/g0;", "w", "Lfh/i;", "t", "()Lfh/i;", "model", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class q extends yg.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 u(q qVar, g0 it) {
        kotlin.jvm.internal.s.h(it, "it");
        qVar.w();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 v(q qVar, g0 it) {
        kotlin.jvm.internal.s.h(it, "it");
        qVar.t().t();
        androidx.fragment.app.s activity = qVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return g0.f38750a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        androidx.databinding.p pVarX = x(inflater, container);
        i iVarT = t();
        Resources resources = getResources();
        kotlin.jvm.internal.s.g(resources, "getResources(...)");
        iVarT.k(resources);
        t().p().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: fh.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.u(this.f38704a, (g0) obj);
            }
        }));
        t().o().j(getViewLifecycleOwner(), new wg.b(new Function1() { // from class: fh.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.v(this.f38705a, (g0) obj);
            }
        }));
        return pVarX.B();
    }

    protected abstract i t();

    public abstract void w();

    public abstract androidx.databinding.p x(LayoutInflater inflater, ViewGroup container);
}
