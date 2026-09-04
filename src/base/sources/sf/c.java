package sf;

import android.R;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import androidx.preference.DialogPreference;
import com.hecorat.screenrecorder.free.data.prefs.FontPreference;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lsf/c;", "Landroidx/preference/f;", "<init>", "()V", "Landroidx/appcompat/app/c$a;", "builder", "Lfl/g0;", "y", "(Landroidx/appcompat/app/c$a;)V", "Lcom/hecorat/screenrecorder/free/data/prefs/FontPreference;", "B", "()Lcom/hecorat/screenrecorder/free/data/prefs/FontPreference;", "", "positiveResult", "x", "(Z)V", "Landroid/content/DialogInterface;", "dialog", "", "which", "onClick", "(Landroid/content/DialogInterface;I)V", "Ljava/util/ArrayList;", "Log/a;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "fontItemList", "j", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends androidx.preference.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ArrayList fontItemList;

    /* JADX INFO: renamed from: sf.c$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(String str) {
            c cVar = new c();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            cVar.setArguments(bundle);
            return cVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f52379a;

        public b(List fontItemList) {
            s.h(fontItemList, "fontItemList");
            this.f52379a = fontItemList;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f52379a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return this.f52379a.get(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup parent) {
            s.h(parent, "parent");
            if (view == null) {
                Object systemService = parent.getContext().getSystemService("layout_inflater");
                s.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                view = ((LayoutInflater) systemService).inflate(R.layout.select_dialog_singlechoice, parent, false);
            }
            if (view != null) {
                CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.text1);
                og.a aVar = (og.a) this.f52379a.get(i10);
                checkedTextView.setTypeface(Typeface.createFromFile(aVar.b()));
                checkedTextView.setText(aVar.a());
            }
            return view;
        }
    }

    public FontPreference B() {
        DialogPreference dialogPreferenceT = super.t();
        FontPreference fontPreference = dialogPreferenceT instanceof FontPreference ? (FontPreference) dialogPreferenceT : null;
        if (fontPreference != null) {
            return fontPreference;
        }
        throw new IllegalStateException("Preference is not a FontPreference");
    }

    @Override // androidx.preference.f, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        s.h(dialog, "dialog");
        super.onClick(dialog, which);
        ArrayList arrayList = this.fontItemList;
        if (arrayList != null && which >= 0 && which < arrayList.size()) {
            Object obj = arrayList.get(which);
            s.g(obj, "get(...)");
            og.a aVar = (og.a) obj;
            FontPreference fontPreferenceB = B();
            String strA = aVar.a();
            s.g(strA, "getFontName(...)");
            fontPreferenceB.V0(strA);
            B().W0(aVar.b());
        }
        dialog.dismiss();
    }

    @Override // androidx.preference.f
    protected void y(androidx.appcompat.app.c.a builder) {
        s.h(builder, "builder");
        super.y(builder);
        HashMap mapC = og.b.c();
        this.fontItemList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        for (String str : mapC.keySet()) {
            try {
                og.a aVar = new og.a(str, (String) mapC.get(str));
                ArrayList arrayList = this.fontItemList;
                if (arrayList != null) {
                    arrayList.add(aVar);
                }
                if (s.c(str, B().getFontPath())) {
                    i10 = i11;
                }
                i11++;
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
        ArrayList arrayList2 = this.fontItemList;
        if (arrayList2 != null) {
            b bVar = new b(arrayList2);
            wp.a.a("Font size: " + arrayList2.size(), new Object[0]);
            builder.k(bVar, i10, this);
        }
        builder.j(null, null);
    }

    @Override // androidx.preference.f
    public void x(boolean positiveResult) {
    }
}
