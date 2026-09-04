package com.hecorat.screenrecorder.free.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.TrashFolderActivity;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import gl.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import nh.f0;
import tf.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0012J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00103\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/TrashFolderActivity;", "Lff/b;", "<init>", "()V", "Lfl/g0;", "B0", "E0", "H0", "", "C0", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isEmpty", "F0", "(Z)V", "isAllOrNothing", "G0", "isInSelectMode", "I0", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Ltf/n0;", "c", "Ltf/n0;", "binding", "Lkf/w;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkf/w;", "trashMediaAdapter", "e", "Landroid/view/MenuItem;", "selectBtn", "f", "deleteBtn", "g", "restoreBtn", "h", "I", "spanCount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrashFolderActivity extends ff.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public n0 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public w trashMediaAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public MenuItem selectBtn;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public MenuItem deleteBtn;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public MenuItem restoreBtn;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int spanCount;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.a.a(Long.valueOf(((pg.d) obj2).d()), Long.valueOf(((pg.d) obj).d()));
        }
    }

    private final void B0() {
        ArrayList arrayList = new ArrayList();
        List listF = f0.F(getApplicationContext(), 1);
        s.g(listF, "queryTrashedMediaOnDevice(...)");
        arrayList.addAll(listF);
        List listF2 = f0.F(this, 2);
        s.g(listF2, "queryTrashedMediaOnDevice(...)");
        arrayList.addAll(listF2);
        if (arrayList.size() > 1) {
            r.y(arrayList, new a());
        }
        w wVar = this.trashMediaAdapter;
        if (wVar == null) {
            s.w("trashMediaAdapter");
            wVar = null;
        }
        wVar.l(arrayList);
        F0(arrayList.size() == 0);
    }

    public static final void D0(TrashFolderActivity trashFolderActivity) {
        trashFolderActivity.E0();
        n0 n0Var = trashFolderActivity.binding;
        if (n0Var == null) {
            s.w("binding");
            n0Var = null;
        }
        n0Var.E.setRefreshing(false);
    }

    private final void E0() {
        if (lg.c.b(this)) {
            B0();
            return;
        }
        n0 n0Var = this.binding;
        n0 n0Var2 = null;
        if (n0Var == null) {
            s.w("binding");
            n0Var = null;
        }
        n0Var.D.A.setVisibility(0);
        n0 n0Var3 = this.binding;
        if (n0Var3 == null) {
            s.w("binding");
        } else {
            n0Var2 = n0Var3;
        }
        n0Var2.B.setVisibility(8);
    }

    private final void H0() {
        u0((Toolbar) findViewById(R.id.tool_bar));
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
            aVarL0.A(true);
            aVarL0.C(R.string.trash);
        }
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final int getSpanCount() {
        return this.spanCount;
    }

    public final void F0(boolean isEmpty) {
        n0 n0Var = this.binding;
        w wVar = null;
        if (n0Var == null) {
            s.w("binding");
            n0Var = null;
        }
        boolean z10 = false;
        n0Var.B.setVisibility(isEmpty ? 0 : 8);
        n0 n0Var2 = this.binding;
        if (n0Var2 == null) {
            s.w("binding");
            n0Var2 = null;
        }
        n0Var2.G.setVisibility(isEmpty ? 8 : 0);
        MenuItem menuItem = this.selectBtn;
        if (menuItem != null) {
            if (!isEmpty) {
                w wVar2 = this.trashMediaAdapter;
                if (wVar2 == null) {
                    s.w("trashMediaAdapter");
                } else {
                    wVar = wVar2;
                }
                if (!wVar.o()) {
                    z10 = true;
                }
            }
            menuItem.setVisible(z10);
        }
    }

    public final void G0(boolean isAllOrNothing) {
        MenuItem menuItem = this.deleteBtn;
        if (menuItem != null) {
            menuItem.setTitle(isAllOrNothing ? R.string.delete_all : R.string.delete);
        }
        MenuItem menuItem2 = this.restoreBtn;
        if (menuItem2 != null) {
            menuItem2.setTitle(isAllOrNothing ? R.string.restore_all : R.string.restore);
        }
    }

    public final void I0(boolean isInSelectMode) {
        String string;
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        if (isInSelectMode) {
            string = "";
        } else {
            string = getString(R.string.trash);
            s.g(string, "getString(...)");
        }
        aVarL0.D(string);
        aVarL0.y(isInSelectMode ? R.drawable.ic_close_24dp : 0);
        MenuItem menuItem = this.selectBtn;
        if (menuItem != null) {
            menuItem.setVisible(!isInSelectMode);
        }
        MenuItem menuItem2 = this.deleteBtn;
        if (menuItem2 != null) {
            menuItem2.setVisible(isInSelectMode);
        }
        MenuItem menuItem3 = this.restoreBtn;
        if (menuItem3 != null) {
            menuItem3.setVisible(isInSelectMode);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        w wVar = null;
        if (requestCode == 2026) {
            w wVar2 = this.trashMediaAdapter;
            if (wVar2 == null) {
                s.w("trashMediaAdapter");
            } else {
                wVar = wVar2;
            }
            wVar.n(resultCode == -1, requestCode);
        } else if (requestCode == 2027) {
            w wVar3 = this.trashMediaAdapter;
            if (wVar3 == null) {
                s.w("trashMediaAdapter");
            } else {
                wVar = wVar3;
            }
            wVar.n(resultCode == -1, requestCode);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        n0 n0Var = (n0) androidx.databinding.g.j(this, R.layout.activity_trash_folder);
        this.binding = n0Var;
        n0 n0Var2 = null;
        if (n0Var == null) {
            s.w("binding");
            n0Var = null;
        }
        View viewB = n0Var.B();
        s.g(viewB, "getRoot(...)");
        y0(viewB);
        this.trashMediaAdapter = new w(this);
        n0 n0Var3 = this.binding;
        if (n0Var3 == null) {
            s.w("binding");
            n0Var3 = null;
        }
        RecyclerView recyclerView = n0Var3.C;
        w wVar = this.trashMediaAdapter;
        if (wVar == null) {
            s.w("trashMediaAdapter");
            wVar = null;
        }
        recyclerView.setAdapter(wVar);
        this.spanCount = nh.b.h(this) / AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, this.spanCount);
        n0 n0Var4 = this.binding;
        if (n0Var4 == null) {
            s.w("binding");
            n0Var4 = null;
        }
        n0Var4.C.setLayoutManager(gridLayoutManager);
        E0();
        n0 n0Var5 = this.binding;
        if (n0Var5 == null) {
            s.w("binding");
        } else {
            n0Var2 = n0Var5;
        }
        n0Var2.E.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: ff.k1
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                TrashFolderActivity.D0(this.f38538a);
            }
        });
        H0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.trash, menu);
        s.e(menu);
        this.selectBtn = menu.findItem(R.id.action_select);
        this.deleteBtn = menu.findItem(R.id.action_delete);
        this.restoreBtn = menu.findItem(R.id.action_restore);
        MenuItem menuItem = this.selectBtn;
        if (menuItem != null) {
            n0 n0Var = this.binding;
            if (n0Var == null) {
                s.w("binding");
                n0Var = null;
            }
            TextView emptyTv = n0Var.B;
            s.g(emptyTv, "emptyTv");
            menuItem.setVisible(!(emptyTv.getVisibility() == 0));
        }
        MenuItem menuItem2 = this.deleteBtn;
        if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = this.restoreBtn;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.h(item, "item");
        w wVar = null;
        switch (item.getItemId()) {
            case android.R.id.home:
                w wVar2 = this.trashMediaAdapter;
                if (wVar2 == null) {
                    s.w("trashMediaAdapter");
                    wVar2 = null;
                }
                if (!wVar2.o()) {
                    finish();
                } else {
                    w wVar3 = this.trashMediaAdapter;
                    if (wVar3 == null) {
                        s.w("trashMediaAdapter");
                    } else {
                        wVar = wVar3;
                    }
                    wVar.w(false);
                }
                break;
            case R.id.action_delete /* 2131361865 */:
                MenuItem menuItem = this.deleteBtn;
                if (!s.c(menuItem != null ? menuItem.getTitle() : null, getString(R.string.delete))) {
                    w wVar4 = this.trashMediaAdapter;
                    if (wVar4 == null) {
                        s.w("trashMediaAdapter");
                    } else {
                        wVar = wVar4;
                    }
                    wVar.i();
                } else {
                    w wVar5 = this.trashMediaAdapter;
                    if (wVar5 == null) {
                        s.w("trashMediaAdapter");
                    } else {
                        wVar = wVar5;
                    }
                    wVar.k();
                }
                break;
            case R.id.action_restore /* 2131361894 */:
                MenuItem menuItem2 = this.restoreBtn;
                if (!s.c(menuItem2 != null ? menuItem2.getTitle() : null, getString(R.string.restore))) {
                    w wVar6 = this.trashMediaAdapter;
                    if (wVar6 == null) {
                        s.w("trashMediaAdapter");
                    } else {
                        wVar = wVar6;
                    }
                    wVar.s();
                } else {
                    w wVar7 = this.trashMediaAdapter;
                    if (wVar7 == null) {
                        s.w("trashMediaAdapter");
                    } else {
                        wVar = wVar7;
                    }
                    wVar.v();
                }
                break;
            case R.id.action_select /* 2131361896 */:
                w wVar8 = this.trashMediaAdapter;
                if (wVar8 == null) {
                    s.w("trashMediaAdapter");
                } else {
                    wVar = wVar8;
                }
                wVar.w(true);
                G0(true);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
