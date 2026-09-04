package jg;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kf.i;
import nh.h0;
import vh.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Activity f42456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected i f42457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f42458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    lg.a f42459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f42460i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42452a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ArrayList f42453b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ArrayList f42454c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ArrayList f42455d = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f42461j = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements h {
        a() {
        }

        @Override // vh.h
        public void a(List list, boolean z10) {
            if (b.this.getActivity() != null) {
                b.this.getActivity().finish();
            }
        }

        @Override // vh.h
        public void b(List list, boolean z10) {
            if (z10) {
                b.this.x();
            }
        }
    }

    public static /* synthetic */ void q(b bVar, List list, List list2) {
        bVar.f42454c.addAll(list);
        bVar.f42453b.addAll(list2);
        bVar.A();
        bVar.f42452a = true;
    }

    protected abstract void A();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().A(this);
        this.f42456e = getActivity();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(this.f42456e).inflate(R.layout.fragment_file_picker, (ViewGroup) null);
        h0.b(this, this.f42461j);
        return viewInflate;
    }

    public int s() {
        return this.f42458g;
    }

    protected ArrayList t() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.f42458g;
        if (i10 == 0) {
            arrayList.addAll(this.f42454c);
            return arrayList;
        }
        String str = (String) this.f42453b.get(i10);
        ArrayList arrayList2 = this.f42454c;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ng.c cVar = (ng.c) obj;
            if (cVar != null && Objects.equals(cVar.a(), str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public ArrayList u() {
        return this.f42453b;
    }

    public int v() {
        return this.f42460i;
    }

    public boolean w() {
        return this.f42452a;
    }

    protected void x() {
        new mf.c(this.f42456e).e(new mf.c.b() { // from class: jg.a
            @Override // mf.c.b
            public final void a(List list, List list2) {
                b.q(this.f42451a, list, list2);
            }
        });
    }

    protected abstract void y();

    public void z(int i10) {
        if (i10 == this.f42458g) {
            return;
        }
        this.f42458g = i10;
        this.f42455d.clear();
        this.f42455d = t();
        y();
    }
}
