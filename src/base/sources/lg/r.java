package lg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.hecorat.screenrecorder.free.R;
import java.util.List;
import vh.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r implements vh.e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements vh.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vh.h f44542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44543b;

        a(vh.h hVar, List list) {
            this.f44542a = hVar;
            this.f44543b = list;
        }

        @Override // vh.i
        public void a() {
            vh.h hVar = this.f44542a;
            if (hVar != null) {
                hVar.b(this.f44543b, true);
            }
        }

        @Override // vh.i
        public void b() {
            vh.h hVar = this.f44542a;
            if (hVar != null) {
                hVar.a(this.f44543b, true);
            }
        }
    }

    private final int j(List list) {
        if (list.size() == 1 && kotlin.jvm.internal.s.c(list.get(0), "android.permission.READ_MEDIA_AUDIO")) {
            return R.string.request_audio_access_permission_rational;
        }
        return Build.VERSION.SDK_INT >= 33 ? R.string.request_video_access_permission_rational : R.string.request_read_external_permission_rational;
    }

    private final void k(final Activity activity, final List list, final List list2, final vh.h hVar) {
        new AlertDialog.Builder(activity, R.style.GeneralDialogTheme).setTitle(R.string.permission_required).setMessage(j(list)).setPositiveButton(R.string.open_settings, new DialogInterface.OnClickListener() { // from class: lg.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                r.l(activity, list2, hVar, list, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: lg.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                r.m(hVar, list, dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: lg.p
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                r.n(hVar, list, dialogInterface);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Activity activity, List list, vh.h hVar, List list2, DialogInterface dialog, int i10) {
        kotlin.jvm.internal.s.h(dialog, "dialog");
        dialog.dismiss();
        i0.i(activity, list, new a(hVar, list2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(vh.h hVar, List list, DialogInterface dialog, int i10) {
        kotlin.jvm.internal.s.h(dialog, "dialog");
        dialog.dismiss();
        if (hVar != null) {
            hVar.a(list, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(vh.h hVar, List list, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (hVar != null) {
            hVar.a(list, true);
        }
    }

    private final void o(final Activity activity, final List list, final vh.h hVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.GeneralDialogTheme);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_request_notification, (ViewGroup) null);
        builder.setView(viewInflate);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        Window window = alertDialogCreate.getWindow();
        kotlin.jvm.internal.s.e(window);
        window.setLayout(-1, -2);
        viewInflate.findViewById(R.id.permission_enable_btn).setOnClickListener(new View.OnClickListener() { // from class: lg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.p(activity, list, alertDialogCreate, hVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Activity activity, final List list, AlertDialog alertDialog, final vh.h hVar, View view) {
        i0.i(activity, list, new vh.i() { // from class: lg.q
            @Override // vh.i
            public final void a() {
                r.q(hVar, list);
            }
        });
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(vh.h hVar, List list) {
        if (hVar != null) {
            hVar.b(list, true);
        }
    }

    private final void r(Activity activity, List list, List list2, vh.h hVar) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (list2.size() == 1 && kotlin.jvm.internal.s.c(list2.get(0), "android.permission.POST_NOTIFICATIONS")) {
            o(activity, list2, hVar);
        } else {
            k(activity, list, list2, hVar);
        }
    }

    @Override // vh.e
    public void a(Activity activity, List allPermissions, List grantedPermissions, boolean z10, vh.h hVar) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(allPermissions, "allPermissions");
        kotlin.jvm.internal.s.h(grantedPermissions, "grantedPermissions");
        if (hVar != null) {
            hVar.b(grantedPermissions, z10);
        }
    }

    @Override // vh.e
    public void b(Activity activity, List allPermissions, List deniedPermissions, boolean z10, vh.h hVar) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(allPermissions, "allPermissions");
        kotlin.jvm.internal.s.h(deniedPermissions, "deniedPermissions");
        wp.a.a("deniedPermissionRequest %s", Boolean.valueOf(z10));
        r(activity, allPermissions, deniedPermissions, hVar);
    }
}
