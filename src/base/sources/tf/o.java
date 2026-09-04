package tf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o extends androidx.databinding.p {
    public final FrameLayout A;
    public final AppBarLayout B;
    public final DrawerLayout C;
    public final w0 D;
    public final NavigationView E;
    public final RelativeLayout F;
    public final ExtendedFloatingActionButton G;
    public final TabLayout H;
    public final Toolbar I;
    public final ViewPager2 J;

    protected o(Object obj, View view, int i10, FrameLayout frameLayout, AppBarLayout appBarLayout, DrawerLayout drawerLayout, w0 w0Var, NavigationView navigationView, RelativeLayout relativeLayout, ExtendedFloatingActionButton extendedFloatingActionButton, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.A = frameLayout;
        this.B = appBarLayout;
        this.C = drawerLayout;
        this.D = w0Var;
        this.E = navigationView;
        this.F = relativeLayout;
        this.G = extendedFloatingActionButton;
        this.H = tabLayout;
        this.I = toolbar;
        this.J = viewPager2;
    }
}
