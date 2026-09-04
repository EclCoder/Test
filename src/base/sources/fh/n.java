package fh;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.lifecycle.q0;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import com.hecorat.screenrecorder.free.models.Resolution;
import gl.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tf.m7;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfh/n;", "Landroidx/appcompat/app/r;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/widget/ArrayAdapter;", "", "a", "Landroid/widget/ArrayAdapter;", "listAdapter", "Lfh/i;", "w", "()Lfh/i;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n extends androidx.appcompat.app.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ArrayAdapter listAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(n nVar, List list) {
        Resolution resolution;
        ArrayAdapter arrayAdapter = nVar.listAdapter;
        if (arrayAdapter == null) {
            kotlin.jvm.internal.s.w("listAdapter");
            arrayAdapter = null;
        }
        arrayAdapter.clear();
        ArrayAdapter arrayAdapter2 = nVar.listAdapter;
        if (arrayAdapter2 == null) {
            kotlin.jvm.internal.s.w("listAdapter");
            arrayAdapter2 = null;
        }
        kotlin.jvm.internal.s.e(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(gl.r.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((EncodeParam) it.next()).getResolution().getName());
        }
        arrayAdapter2.addAll(arrayList);
        ArrayAdapter arrayAdapter3 = nVar.listAdapter;
        if (arrayAdapter3 == null) {
            kotlin.jvm.internal.s.w("listAdapter");
            arrayAdapter3 = null;
        }
        int i10 = 0;
        Iterator it2 = yl.g.m(0, arrayAdapter3.getCount()).iterator();
        while (it2.hasNext()) {
            int iNextInt = ((j0) it2).nextInt();
            if (i10 < 0) {
                gl.r.u();
            }
            ArrayAdapter arrayAdapter4 = nVar.listAdapter;
            if (arrayAdapter4 == null) {
                kotlin.jvm.internal.s.w("listAdapter");
                arrayAdapter4 = null;
            }
            Object item = arrayAdapter4.getItem(iNextInt);
            EncodeParam encodeParam = (EncodeParam) nVar.w().m().f();
            if (kotlin.jvm.internal.s.c(item, (encodeParam == null || (resolution = encodeParam.getResolution()) == null) ? null : resolution.getName())) {
                Dialog dialog = nVar.getDialog();
                kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
                ((androidx.appcompat.app.c) dialog).t().setItemChecked(i10, true);
            }
            i10++;
        }
        i10 = -1;
        Dialog dialog2 = nVar.getDialog();
        kotlin.jvm.internal.s.f(dialog2, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        ((androidx.appcompat.app.c) dialog2).t().setItemChecked(i10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(n nVar, View view) {
        nVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(n nVar, DialogInterface dialogInterface, int i10) {
        ArrayAdapter arrayAdapter = nVar.listAdapter;
        if (arrayAdapter == null) {
            kotlin.jvm.internal.s.w("listAdapter");
            arrayAdapter = null;
        }
        String str = (String) arrayAdapter.getItem(i10);
        if (str != null) {
            nVar.w().x(str);
        }
        dialogInterface.dismiss();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.listAdapter = new ArrayAdapter(requireContext(), R.layout.simple_list_item_single_choice);
        w().l().j(this, new q0() { // from class: fh.m
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                n.x(this.f38702a, (List) obj);
            }
        });
    }

    @Override // androidx.appcompat.app.r, androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ArrayAdapter arrayAdapter = null;
        m7 m7Var = (m7) androidx.databinding.g.h(LayoutInflater.from(getContext()), com.hecorat.screenrecorder.free.R.layout.title_list_dialog, null, false);
        m7Var.C.setText(getResources().getString(com.hecorat.screenrecorder.free.R.string.live_resolution));
        m7Var.A.setOnClickListener(new View.OnClickListener() { // from class: fh.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.y(this.f38700a, view);
            }
        });
        bc.b bVarB = new bc.b(requireContext(), com.hecorat.screenrecorder.free.R.style.LightDialogTheme).b(m7Var.B());
        ArrayAdapter arrayAdapter2 = this.listAdapter;
        if (arrayAdapter2 == null) {
            kotlin.jvm.internal.s.w("listAdapter");
        } else {
            arrayAdapter = arrayAdapter2;
        }
        androidx.appcompat.app.c cVarCreate = bVarB.k(arrayAdapter, 0, new DialogInterface.OnClickListener() { // from class: fh.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                n.z(this.f38701a, dialogInterface, i10);
            }
        }).create();
        kotlin.jvm.internal.s.g(cVarCreate, "create(...)");
        return cVarCreate;
    }

    public abstract i w();
}
