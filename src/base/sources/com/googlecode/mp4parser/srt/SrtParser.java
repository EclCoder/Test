package com.googlecode.mp4parser.srt;

import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SrtParser {
    public static TextTrackImpl parse(InputStream inputStream) throws IOException {
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream, C.UTF8_NAME));
        TextTrackImpl textTrackImpl = new TextTrackImpl();
        while (lineNumberReader.readLine() != null) {
            String line = lineNumberReader.readLine();
            String str = "";
            while (true) {
                String line2 = lineNumberReader.readLine();
                if (line2 == null || line2.trim().equals("")) {
                    break;
                }
                str = String.valueOf(str) + line2 + "\n";
            }
            textTrackImpl.getSubs().add(new TextTrackImpl.Line(parse(line.split("-->")[0]), parse(line.split("-->")[1]), str));
        }
        return textTrackImpl;
    }

    private static long parse(String str) {
        long j10 = Long.parseLong(str.split(":")[0].trim());
        long j11 = Long.parseLong(str.split(":")[1].trim());
        long j12 = Long.parseLong(str.split(":")[2].split(",")[0].trim());
        return (j10 * 3600000) + (j11 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + (j12 * 1000) + Long.parseLong(str.split(":")[2].split(",")[1].trim());
    }
}
