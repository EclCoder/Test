package com.hecorat.screenrecorder.free.helpers.webserver;

import android.content.Context;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import nh.e;
import nh.l0;
import qd.qPi.SVWsZyNSAChGIA;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a extends BaseWebServer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f23009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f23010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    lg.a f23011n;

    public a(int i10, Context context) {
        super(i10);
        this.f23009l = context;
        AzRecorderApp.d().q(this);
        this.f23010m = e.l(context, this.f23011n);
    }

    private void y(String str, String str2) {
        File file = new File(str + "/" + str2);
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
                file.delete();
            } else {
                file.delete();
            }
        }
        l0.A(this.f23009l, "grant_permission_storage");
    }

    private boolean z(String str) {
        return str.endsWith(".mp4") || str.endsWith(".gif") || str.endsWith(".png") || str.endsWith(".jpg");
    }

    @Override // com.hecorat.screenrecorder.free.helpers.webserver.BaseWebServer
    public BaseWebServer.m q(BaseWebServer.k kVar) {
        File file;
        boolean z10;
        String uri = kVar.getUri();
        Map parameters = kVar.getParameters();
        Set<String> setKeySet = parameters.keySet();
        if (setKeySet.size() > 0) {
            for (String str : setKeySet) {
                if ("delete".equals(str)) {
                    y(uri, (String) ((List) parameters.get(str)).get(0));
                }
            }
        }
        if (uri == null) {
            return null;
        }
        try {
            if (uri.contains(".js")) {
                String[] strArrSplit = uri.split("/");
                return BaseWebServer.l(BaseWebServer.m.d.OK, "application/javascript", this.f23009l.getAssets().open("pages/" + strArrSplit[strArrSplit.length - 1]));
            }
            if (uri.contains(".css")) {
                return BaseWebServer.l(BaseWebServer.m.d.OK, "text/css", this.f23009l.getAssets().open("pages/main.css"));
            }
            if (uri.contains("/assets") && (uri.endsWith(".png") || uri.endsWith(SVWsZyNSAChGIA.pzfIHQEgLUcyC))) {
                String[] strArrSplit2 = uri.split("/");
                return BaseWebServer.l(BaseWebServer.m.d.OK, NpmRNZ.NIkHWin, this.f23009l.getAssets().open(strArrSplit2[strArrSplit2.length - 1]));
            }
            if (z(uri)) {
                File file2 = new File(uri);
                BaseWebServer.m mVarL = BaseWebServer.l(BaseWebServer.m.d.OK, URLConnection.getFileNameMap().getContentTypeFor(uri), new FileInputStream(file2));
                mVarL.c(Command.HTTP_HEADER_ETAG, Integer.toHexString(new Random().nextInt()));
                mVarL.c("Connection", "Keep-alive");
                mVarL.c("content-disposition", "attachment");
                mVarL.c("Content-Length", String.valueOf(file2.length()));
                return mVarL;
            }
            if (uri.length() < this.f23010m.length()) {
                uri = this.f23010m;
            }
            if (uri.equals("/") || uri.equals(this.f23010m)) {
                file = new File(this.f23010m);
                z10 = false;
            } else {
                if (uri.equals(this.f23010m + "/")) {
                    file = new File(this.f23010m);
                    z10 = false;
                } else {
                    file = new File(uri);
                    z10 = true;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f23009l.getAssets().open("pages/index.html")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
            sb2.append("<h2>Output folder: ");
            sb2.append(this.f23010m);
            sb2.append("</h2>");
            sb2.append("<div class=\"bdr\"><table cellpadding=\"10\"><tr><td></td><td>Name</td><td>Last Modified</td><td>Size</td><td></td></tr>");
            if (z10) {
                sb2.append("<tr><td>");
                sb2.append("<img src=\"assets/icon_back.png\" alt=\"Parent\" style=\"width:32px;height:32px;\"></td>");
                sb2.append("<td><a href=\"..\" alt = \"\">Parent directory</a></td></tr>");
            }
            File[] fileArrListFiles = file.listFiles();
            int i10 = 0;
            while (i10 < fileArrListFiles.length - 1) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < fileArrListFiles.length; i12++) {
                    if ((!fileArrListFiles[i10].isDirectory() || fileArrListFiles[i12].isDirectory()) && ((!fileArrListFiles[i10].isDirectory() && fileArrListFiles[i12].isDirectory()) || fileArrListFiles[i12].lastModified() > fileArrListFiles[i10].lastModified())) {
                        File file3 = fileArrListFiles[i10];
                        fileArrListFiles[i10] = fileArrListFiles[i12];
                        fileArrListFiles[i12] = file3;
                    }
                }
                i10 = i11;
            }
            for (File file4 : fileArrListFiles) {
                String name = file4.getName();
                if (file4.isDirectory() || z(name)) {
                    sb2.append("<tr><td>");
                    if (file4.isDirectory()) {
                        sb2.append("<img src=\"assets/icon_folder.png\" alt=\"Folder\" style=\"width:32px;height:32px;\">");
                    } else if (name.endsWith(".gif")) {
                        sb2.append("<img src=\"assets/icon_gif.png\" alt=\"GIF\" style=\"width:32px;height:32px;\">");
                    } else if (name.endsWith(".png")) {
                        sb2.append("<img src=\"assets/icon_image.png\" alt=\"Image\" style=\"width:32px;height:32px;\">");
                    } else if (name.endsWith(".mp4")) {
                        sb2.append("<img src=\"assets/icon_video.png\" alt=\"Video\" style=\"width:32px;height:32px;\">");
                    }
                    sb2.append("</td><td>");
                    sb2.append("<a href=\"");
                    sb2.append(file4.getAbsolutePath());
                    if (file4.isDirectory()) {
                        sb2.append("/");
                    }
                    sb2.append("\" alt = \"\">");
                    sb2.append(name);
                    sb2.append("</a></td>");
                    String str2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", l0.e()).format(new Date(file4.lastModified()));
                    sb2.append("<td>");
                    sb2.append(str2);
                    sb2.append("</td>");
                    if (file4.isDirectory()) {
                        sb2.append("<td></td>");
                    } else {
                        sb2.append("<td>");
                        sb2.append(e.c(file4.length()));
                        sb2.append("</td>");
                    }
                    sb2.append("<td><a href=\"" + file4.getParentFile().getAbsolutePath() + "?delete=" + name + "\" onclick=\"javascript:return confirmDel()\">Delete</a></td>");
                    sb2.append("</tr>");
                }
            }
            sb2.append("</table></div></body></html>\n");
            return BaseWebServer.o(sb2.toString());
        } catch (IOException unused) {
            return null;
        }
    }
}
