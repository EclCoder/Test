package w0;

import android.view.View;
import android.widget.AdapterView;
import androidx.databinding.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: w0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0848a {
        void onItemSelected(AdapterView adapterView, View view, int i10, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    public static void a(AdapterView adapterView, InterfaceC0848a interfaceC0848a, c cVar, h hVar) {
        if (interfaceC0848a == null && cVar == null && hVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(interfaceC0848a, cVar, hVar));
        }
    }

    public static void b(AdapterView adapterView, int i10) {
        if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0848a f55763a;

        public b(InterfaceC0848a interfaceC0848a, c cVar, h hVar) {
            this.f55763a = interfaceC0848a;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            InterfaceC0848a interfaceC0848a = this.f55763a;
            if (interfaceC0848a != null) {
                interfaceC0848a.onItemSelected(adapterView, view, i10, j10);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
