package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f1083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f1084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f1085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f1086d;

    public f(e eVar) {
        this.f1083a = eVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1084b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f1083a) {
            a();
        }
        j.a aVar = this.f1086d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f1086d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f1083a;
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(eVar.w());
        c cVar = new c(aVar.getContext(), h.g.f39959l);
        this.f1085c = cVar;
        cVar.d(this);
        this.f1083a.b(this.f1085c);
        aVar.a(this.f1085c.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            aVar.b(viewA);
        } else {
            aVar.d(eVar.y()).setTitle(eVar.z());
        }
        aVar.i(this);
        androidx.appcompat.app.c cVarCreate = aVar.create();
        this.f1084b = cVarCreate;
        cVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1084b.getWindow().getAttributes();
        attributes.type = BackupConstant.SCENE_CLOSED_WITHOUT_SHOW;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1084b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1083a.O((g) this.f1085c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1085c.b(this.f1083a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1084b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1084b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1083a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1083a.performShortcut(i10, keyEvent, 0);
    }
}
