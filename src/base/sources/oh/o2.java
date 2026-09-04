package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.databinding.p;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00188\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Loh/o2;", "Landroidx/databinding/p;", "VB", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "layoutInflater", "y", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "Luh/m0;", "v", "()Luh/m0;", "a", "Landroidx/databinding/p;", "w", "()Landroidx/databinding/p;", "B", "(Landroidx/databinding/p;)V", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Luh/m0;", "x", "C", "(Luh/m0;)V", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o2<VB extends androidx.databinding.p> extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    protected androidx.databinding.p binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    protected uh.m0 viewModel;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48773a;

        b(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48773a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48773a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48773a.invoke(obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 A(ArrayAdapter arrayAdapter, List list) {
        arrayAdapter.addAll(list);
        arrayAdapter.notifyDataSetChanged();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(o2 o2Var, View view) {
        o2Var.dismiss();
    }

    protected final void B(androidx.databinding.p pVar) {
        kotlin.jvm.internal.s.h(pVar, "<set-?>");
        this.binding = pVar;
    }

    protected final void C(uh.m0 m0Var) {
        kotlin.jvm.internal.s.h(m0Var, "<set-?>");
        this.viewModel = m0Var;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.FullScreenDialogStyle);
        C(v());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        B(y(inflater, container));
        View viewB = w().B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((ImageView) w().B().findViewById(R.id.back_btn)).setOnClickListener(new View.OnClickListener() { // from class: oh.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o2.z(this.f48732a, view2);
            }
        });
        Spinner spinner = (Spinner) w().B().findViewById(R.id.bucket_spinner);
        final ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.item_spinner);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new a());
        x().r().j(getViewLifecycleOwner(), new b(new Function1() { // from class: oh.n2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o2.A(arrayAdapter, (List) obj);
            }
        }));
    }

    public abstract uh.m0 v();

    protected final androidx.databinding.p w() {
        androidx.databinding.p pVar = this.binding;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.s.w("binding");
        return null;
    }

    protected final uh.m0 x() {
        uh.m0 m0Var = this.viewModel;
        if (m0Var != null) {
            return m0Var;
        }
        kotlin.jvm.internal.s.w("viewModel");
        return null;
    }

    public abstract androidx.databinding.p y(LayoutInflater layoutInflater, ViewGroup container);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            androidx.lifecycle.p0 p0VarU = o2.this.x().u();
            List list = (List) o2.this.x().r().f();
            p0VarU.q(list != null ? (String) list.get(i10) : null);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
