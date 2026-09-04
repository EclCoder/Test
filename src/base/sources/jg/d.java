package jg;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.FilePickerActivity;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import kf.i;
import nh.e;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class d extends b implements i.a {
    @Override // jg.b
    protected void A() {
        View view = getView();
        if (view == null) {
            return;
        }
        ((ProgressBar) view.findViewById(R.id.load_file_progress)).setVisibility(8);
        String strH = this.f42459h.h(R.string.pref_default_folder_image, null);
        if (strH == null || !this.f42453b.contains(strH)) {
            this.f42458g = 1;
        } else {
            this.f42458g = this.f42453b.indexOf(strH);
        }
        ArrayList arrayListT = t();
        this.f42455d = arrayListT;
        this.f42457f = new i(this, this, arrayListT);
        this.f42460i = nh.b.h(getContext()) / AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f42456e, this.f42460i));
        recyclerView.setAdapter(this.f42457f);
        ((FilePickerActivity) this.f42456e).z0();
    }

    @Override // jg.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f42453b.add(getString(R.string.all_images));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (!this.f42454c.isEmpty()) {
            this.f42459h.m(R.string.pref_default_folder_image, (String) this.f42453b.get(this.f42458g));
        }
        super.onDestroy();
    }

    @Override // jg.b
    protected void y() {
        this.f42457f.i(this.f42455d);
    }

    @Override // kf.i.a
    public void e(int i10) {
        ng.b bVar = (ng.b) this.f42455d.get(i10);
        String strF = bVar.f();
        Intent intent = new Intent();
        if (bVar.i()) {
            String str = e.m(this.f42456e) + "/" + strF.replace("/", "_");
            e.b(this.f42456e, strF, str);
            intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str);
        } else {
            intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, strF);
            intent.putExtra(YSHErhbVu.PGdyk, ((ng.c) this.f42455d.get(i10)).b());
        }
        this.f42456e.setResult(-1, intent);
        this.f42456e.finish();
    }
}
