package bh;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.preference.j;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.widget.ColorSeekBar;
import com.hecorat.screenrecorder.free.widget.SimpleColorView;
import zg.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i extends o implements SimpleColorView.a, ColorSeekBar.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f8951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SimpleColorView f8952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ColorSeekBar f8953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f8954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SharedPreferences f8955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f8956l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void b(int i10);

        void g(int i10);
    }

    public i(Context context) {
        super(context);
        this.f8954j = context;
        SharedPreferences sharedPreferencesB = j.b(context);
        this.f8955k = sharedPreferencesB;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.float_draw_settings, (ViewGroup) null);
        this.f8951g = viewInflate;
        SimpleColorView simpleColorView = (SimpleColorView) viewInflate.findViewById(R.id.color_picker_view);
        this.f8952h = simpleColorView;
        simpleColorView.setOnColorPickListener(this);
        ColorSeekBar colorSeekBar = (ColorSeekBar) viewInflate.findViewById(R.id.size_csb);
        this.f8953i = colorSeekBar;
        colorSeekBar.setOnSeekBarChangeListener(this);
        colorSeekBar.setSize(sharedPreferencesB.getInt(context.getString(R.string.pref_drawing_size), 6));
        colorSeekBar.setColor(sharedPreferencesB.getInt(context.getString(R.string.pref_drawing_color), context.getResources().getColor(R.color.bright_red)));
        viewInflate.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: bh.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8950a.n();
            }
        });
        d(viewInflate);
        WindowManager.LayoutParams layoutParams = this.f58878b;
        layoutParams.gravity = 8388691;
        layoutParams.flags = 32;
    }

    @Override // com.hecorat.screenrecorder.free.widget.SimpleColorView.a
    public void a(int i10) {
        this.f8955k.edit().putInt(this.f8954j.getString(R.string.pref_drawing_color), i10).apply();
        this.f8956l.b(i10);
    }

    @Override // com.hecorat.screenrecorder.free.widget.SimpleColorView.a
    public void b(int i10) {
        this.f8953i.setColor(i10);
    }

    @Override // com.hecorat.screenrecorder.free.widget.ColorSeekBar.a
    public void c(int i10) {
        this.f8955k.edit().putInt(this.f8954j.getString(R.string.pref_drawing_size), i10).apply();
        this.f8956l.g(i10);
    }

    @Override // zg.o
    protected int j() {
        return -2;
    }

    @Override // zg.o
    protected int l() {
        return -1;
    }

    public void q(a aVar) {
        this.f8956l = aVar;
    }

    public void r(View.OnKeyListener onKeyListener) {
        this.f8951g.setOnKeyListener(onKeyListener);
    }

    public void s() {
        e();
        this.f8951g.setFocusableInTouchMode(true);
        this.f8951g.requestFocus();
    }
}
