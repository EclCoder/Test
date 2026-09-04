/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001c660
 * Address  : 0001c660
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Removing unreachable block (ram,0x0001cc7a) */
/* WARNING: Removing unreachable block (ram,0x0001cc82) */
/* WARNING: Removing unreachable block (ram,0x0001cd1e) */

int * FUN_0001c660(undefined4 *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  byte bVar1;
  char cVar2;
  byte *pbVar3;
  int iVar4;
  int *piVar5;
  size_t sVar6;
  uint uVar7;
  int iVar8;
  byte *pbVar9;
  int iVar10;
  char *pcVar11;
  undefined1 *puVar12;
  byte *pbVar13;
  uint uVar14;
  char *pcVar15;
  undefined1 *puVar16;
  uint uVar17;
  int unaff_r6;
  
  pbVar3 = (byte *)*param_1;
  pbVar13 = (byte *)param_1[1];
  uVar7 = (int)pbVar13 - (int)pbVar3;
  if (pbVar13 == pbVar3) goto switchD_0001c684_caseD_42;
  bVar1 = *pbVar3;
  switch(bVar1) {
  case 0x41:
    pbVar9 = pbVar3 + 1;
    *param_1 = pbVar9;
    if (pbVar13 == pbVar9) {
LAB_0001cc84:
      iVar8 = FUN_0001eb18(param_1);
      if (((iVar8 == 0) || (pcVar11 = (char *)*param_1, pcVar11 == (char *)param_1[1])) ||
         (*pcVar11 != '_')) goto LAB_0001cd10;
LAB_0001ccd8:
      pbVar3 = (byte *)(pcVar11 + 1);
    }
    else {
      if (0xfffffff5 < *pbVar9 - 0x3a) {
        piVar5 = (int *)0x0;
        FUN_0001c5c0(&stack0xffffffd8,param_1,0);
        iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
        pcVar11 = (char *)*param_1;
        if ((pcVar11 == (char *)param_1[1]) || (*pcVar11 != '_')) goto LAB_0001ca38;
        goto LAB_0001ccd8;
      }
      if (*pbVar9 != 0x5f) goto LAB_0001cc84;
      pbVar3 = pbVar3 + 2;
      iVar8 = 0;
    }
    *param_1 = pbVar3;
    iVar4 = FUN_0001c660(param_1);
    if (iVar4 != 0) {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      FUN_0001e9c0(piVar5,0xf,0,0,1);
      piVar5[2] = iVar4;
      piVar5[3] = iVar8;
      iVar8 = DAT_0001cf18 + 0x1cd0c;
LAB_0001cd0a:
      *piVar5 = iVar8 + 8;
      goto LAB_0001ca38;
    }
    goto LAB_0001cd10;
  default:
    goto switchD_0001c684_caseD_42;
  case 0x43:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar5 + 1) = 5;
    iVar4 = 8;
    iVar10 = DAT_0001cb34 + 0x1c906;
    goto LAB_0001c92e;
  case 0x44:
    if (uVar7 < 2) {
      return (int *)0x0;
    }
    bVar1 = pbVar3[1];
    piVar5 = (int *)0x0;
    switch(bVar1) {
    case 0x41:
      if (uVar7 != 2) {
        bVar1 = pbVar3[2];
        *param_1 = pbVar3 + 3;
        switch(bVar1) {
        case 0x69:
          pcVar11 = (char *)(DAT_0001d250 + 0x1cf7c);
          break;
        case 0x6a:
          iVar8 = DAT_0001d254 + 0x1d170;
          goto LAB_0001cf96;
        default:
          return (int *)0x0;
        case 0x6c:
          pcVar11 = (char *)(DAT_0001d258 + 0x1d164);
          goto LAB_0001cc22;
        case 0x6d:
          pcVar11 = (char *)(DAT_0001d25c + 0x1d176);
LAB_0001d1a0:
          piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
          sVar6 = strlen(pcVar11);
          piVar5[2] = (int)pcVar11;
          piVar5[3] = sVar6;
          *(undefined1 *)(piVar5 + 1) = 8;
          *piVar5 = DAT_000231f0 + 0x231e2;
          *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
          return piVar5;
        case 0x73:
          pcVar11 = (char *)(DAT_0001d248 + 0x1d17c);
          goto LAB_0001cb78;
        case 0x74:
          iVar8 = DAT_0001d24c + 0x1d16a;
LAB_0001d186:
          piVar5 = (int *)FUN_0001de04(param_1,iVar8);
          return piVar5;
        }
        goto LAB_0001c854;
      }
      goto LAB_0001cfca;
    case 0x42:
    case 0x55:
      pbVar3 = pbVar3 + 2;
      *param_1 = pbVar3;
      if ((pbVar13 == pbVar3) || (*pbVar3 - 0x3a < 0xfffffff6)) {
        iVar8 = FUN_0001eb18(param_1);
        if (iVar8 == 0) {
          return (int *)0x0;
        }
      }
      else {
        FUN_0001c5c0(&stack0xffffffd8,param_1,0);
        iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
      }
      pcVar11 = (char *)*param_1;
      if (pcVar11 == (char *)param_1[1]) {
        return (int *)0x0;
      }
      if (*pcVar11 != '_') {
        return (int *)0x0;
      }
      *param_1 = pcVar11 + 1;
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      *(undefined1 *)(piVar5 + 1) = 0x20;
      *(bool *)(piVar5 + 3) = bVar1 == 0x42;
      piVar5[2] = iVar8;
      iVar8 = DAT_0001d2a4 + 0x1d034;
      break;
    default:
      return (int *)0x0;
    case 0x46:
      *param_1 = pbVar3 + 2;
      iVar8 = FUN_0001bec0(param_1,DAT_0001d23c + 0x1cf8c,3);
      if (iVar8 != 0) {
        iVar8 = DAT_0001d240 + 0x1cf98;
LAB_0001cf96:
        piVar5 = (int *)FUN_00021264(param_1,iVar8);
        return piVar5;
      }
      FUN_0001c5c0(&stack0xffffffd8,param_1,0);
      iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
      pcVar11 = (char *)*param_1;
      if (pcVar11 == (char *)param_1[1]) {
        return (int *)0x0;
      }
      if (*pcVar11 != '_') {
        return (int *)0x0;
      }
      *param_1 = pcVar11 + 1;
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar5 + 1) = 0x1f;
      piVar5[2] = iVar8;
      iVar8 = DAT_0001d244 + 0x1d082;
      break;
    case 0x4b:
    case 0x6b:
      *param_1 = pbVar3 + 2;
      iVar8 = FUN_0001d34c(param_1,0);
      if (iVar8 == 0) {
        return (int *)0x0;
      }
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar5 + 1) = 5;
      iVar4 = 0xf;
      iVar10 = DAT_0001cf20 + 0x1cd86;
      if (bVar1 == 0x6b) {
        iVar4 = 5;
        iVar10 = DAT_0001cf1c + 0x1cd84;
      }
      piVar5[2] = iVar8;
      piVar5[3] = iVar10;
      piVar5[4] = iVar4;
      iVar8 = DAT_0001cf24 + 0x1cd94;
      break;
    case 0x4f:
    case 0x6f:
    case 0x77:
    case 0x78:
      goto switchD_0001c684_caseD_46;
    case 0x52:
      if (uVar7 != 2) {
        bVar1 = pbVar3[2];
        *param_1 = pbVar3 + 3;
        switch(bVar1) {
        case 0x69:
          pcVar11 = (char *)(DAT_0001d268 + 0x1d0aa);
          break;
        case 0x6a:
          iVar8 = DAT_0001d26c + 0x1d19c;
          goto LAB_0001cf96;
        case 0x6b:
        case 0x6e:
        case 0x6f:
        case 0x70:
        case 0x71:
        case 0x72:
          return (int *)0x0;
        case 0x6c:
          pcVar11 = (char *)(DAT_0001d270 + 0x1d182);
          goto LAB_0001cc22;
        case 0x6d:
          pcVar11 = (char *)(DAT_0001d274 + 0x1d1a2);
          goto LAB_0001d1a0;
        case 0x73:
          pcVar11 = (char *)(DAT_0001d260 + 0x1d1b6);
          goto LAB_0001cb78;
        case 0x74:
          iVar8 = DAT_0001d264 + 0x1d188;
          goto LAB_0001d186;
        default:
          return (int *)0x0;
        }
        goto LAB_0001c854;
      }
LAB_0001cfca:
      pbVar3 = pbVar3 + 3;
LAB_0001cfcc:
      *param_1 = pbVar3;
      return (int *)0x0;
    case 0x53:
      pbVar9 = pbVar3 + 2;
      *param_1 = pbVar9;
      if (pbVar13 == pbVar9) {
        return (int *)0x0;
      }
      uVar7 = (int)pbVar13 - (int)pbVar9;
      if (uVar7 < 2) {
        return (int *)0x0;
      }
      if (*pbVar9 != 0x44) {
        return (int *)0x0;
      }
      if (pbVar3[3] == 0x52) {
        if (2 < uVar7) {
          bVar1 = pbVar3[4];
          *param_1 = pbVar3 + 5;
          switch(bVar1) {
          case 0x69:
            pcVar11 = (char *)(DAT_0001d294 + 0x1d0d6);
            break;
          case 0x6a:
            pcVar11 = (char *)(DAT_0001d298 + 0x1d20a);
            goto LAB_0001d1a0;
          case 0x6b:
          case 0x6e:
          case 0x6f:
          case 0x70:
          case 0x71:
          case 0x72:
            return (int *)0x0;
          case 0x6c:
            pcVar11 = (char *)(DAT_0001d29c + 0x1d1dc);
            goto LAB_0001d1da;
          case 0x6d:
            pcVar11 = (char *)(DAT_0001d2a0 + 0x1d21e);
            goto LAB_0001d21c;
          case 0x73:
            pcVar11 = (char *)(DAT_0001d28c + 0x1d232);
            goto LAB_0001c8b4;
          case 0x74:
            pcVar11 = (char *)(DAT_0001d290 + 0x1d1f0);
            goto LAB_0001d1ee;
          default:
            return (int *)0x0;
          }
          goto LAB_0001cc22;
        }
      }
      else {
        if (pbVar3[3] != 0x41) {
          return (int *)0x0;
        }
        if (2 < uVar7) {
          bVar1 = pbVar3[4];
          *param_1 = pbVar3 + 5;
          switch(bVar1) {
          case 0x69:
            pcVar11 = (char *)(DAT_0001cf3c + 0x1cee8);
            break;
          case 0x6a:
            pcVar11 = (char *)(DAT_0001d280 + 0x1d204);
            goto LAB_0001d1a0;
          default:
            return (int *)0x0;
          case 0x6c:
            pcVar11 = (char *)(DAT_0001d284 + 0x1d1d0);
LAB_0001d1da:
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            sVar6 = strlen(pcVar11);
            piVar5[2] = (int)pcVar11;
            piVar5[3] = sVar6;
            *(undefined1 *)(piVar5 + 1) = 8;
            *piVar5 = DAT_00023270 + 0x23262;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            return piVar5;
          case 0x6d:
            pcVar11 = (char *)(DAT_0001d288 + 0x1d210);
LAB_0001d21c:
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            sVar6 = strlen(pcVar11);
            piVar5[2] = (int)pcVar11;
            piVar5[3] = sVar6;
            *(undefined1 *)(piVar5 + 1) = 8;
            *piVar5 = DAT_000232b0 + 0x232a2;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            return piVar5;
          case 0x73:
            pcVar11 = (char *)(DAT_0001d278 + 0x1d216);
            goto LAB_0001c8b4;
          case 0x74:
            pcVar11 = (char *)(DAT_0001d27c + 0x1d1d6);
LAB_0001d1ee:
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            sVar6 = strlen(pcVar11);
            piVar5[2] = (int)pcVar11;
            piVar5[3] = sVar6;
            *(undefined1 *)(piVar5 + 1) = 8;
            *piVar5 = DAT_00023230 + 0x23222;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            return piVar5;
          }
          goto LAB_0001cc22;
        }
      }
      pbVar3 = pbVar3 + 5;
      goto LAB_0001cfcc;
    case 0x54:
    case 0x74:
      piVar5 = (int *)FUN_0001e3d8(param_1);
      goto LAB_0001ca38;
    case 0x61:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001d2ac + 0x1cfb0;
      goto LAB_0001cc3a;
    case 99:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001d2b0 + 0x1cfba;
      goto LAB_0001cb90;
    case 100:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)(DAT_0001d234 + 0x1cfda);
      goto LAB_0001cc0a;
    case 0x65:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)(DAT_0001d238 + 0x1cfc4);
      goto LAB_0001c86c;
    case 0x66:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)(DAT_0001cf28 + 0x1cdc2);
LAB_0001cc0a:
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      sVar6 = strlen(pcVar11);
      piVar5[2] = (int)pcVar11;
      piVar5[3] = sVar6;
      *(undefined1 *)(piVar5 + 1) = 8;
      *piVar5 = DAT_000230b0 + 0x230a2;
      *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
      return piVar5;
    case 0x68:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001cf40 + 0x1cef2;
      goto LAB_0001cc3a;
    case 0x69:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001d2a8 + 0x1cfe4;
      goto LAB_0001c7be;
    case 0x6e:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001cf2c + 0x1cdcc;
LAB_0001cb90:
      piVar5 = (int *)FUN_0002275c(param_1,iVar8);
      return piVar5;
    case 0x70:
      *param_1 = pbVar3 + 2;
      iVar8 = FUN_0001c660(param_1);
      if (iVar8 == 0) {
        return (int *)0x0;
      }
      piVar5 = (int *)FUN_00020214(param_1,&stack0xffffffd8);
      goto LAB_0001ca40;
    case 0x73:
      *param_1 = pbVar3 + 2;
      iVar8 = DAT_0001cf38 + 0x1ce6c;
LAB_0001c7be:
      piVar5 = (int *)FUN_000230b4(param_1,iVar8);
      return piVar5;
    case 0x75:
      *param_1 = pbVar3 + 2;
      pcVar11 = (char *)((int)&DAT_0001cefc + DAT_0001cf44);
      goto LAB_0001c83c;
    case 0x76:
      iVar8 = FUN_0001bec0(param_1,DAT_0001cf30 + 0x1cdd6,2);
      if (iVar8 != 0) {
        pbVar3 = (byte *)*param_1;
        if (((byte *)param_1[1] == pbVar3) || (bVar1 = *pbVar3, bVar1 < 0x31)) {
LAB_0001d11e:
          iVar8 = FUN_0001eb18(param_1);
          if (((iVar8 != 0) && (pcVar11 = (char *)*param_1, pcVar11 != (char *)param_1[1])) &&
             (*pcVar11 == '_')) {
            *param_1 = pcVar11 + 1;
            iVar8 = FUN_0001c660(param_1);
            if (iVar8 != 0) {
              puVar12 = &stack0xffffffd4;
              puVar16 = &stack0xffffffd8;
LAB_0001d154:
              piVar5 = (int *)FUN_00023768(param_1,puVar12,puVar16);
            }
          }
        }
        else if (bVar1 < 0x3a) {
          FUN_0001c5c0(&stack0xffffffd8,param_1,0);
          iVar8 = FUN_0001e86c(param_1,&stack0xffffffd8);
          pcVar11 = (char *)*param_1;
          if ((pcVar11 != (char *)param_1[1]) && (*pcVar11 == '_')) {
            pcVar15 = pcVar11 + 1;
            *param_1 = pcVar15;
            if ((pcVar15 == (char *)param_1[1]) || (*pcVar15 != 'p')) {
              iVar8 = FUN_0001c660(param_1);
              if (iVar8 != 0) {
                puVar12 = &stack0xffffffd8;
                puVar16 = &stack0xffffffd4;
                goto LAB_0001d154;
              }
            }
            else {
              *param_1 = pcVar11 + 2;
              piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
              *(undefined1 *)(piVar5 + 1) = 0x1e;
              piVar5[2] = iVar8;
              *piVar5 = DAT_0001cf34 + 0x1ce56;
              *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
            }
          }
        }
        else {
          if (bVar1 != 0x5f) goto LAB_0001d11e;
          *param_1 = pbVar3 + 1;
          iVar8 = FUN_0001c660(param_1);
          if (iVar8 != 0) {
            piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
            piVar5[2] = iVar8;
            piVar5[3] = 0;
            *(undefined1 *)(piVar5 + 1) = 0x1d;
            *piVar5 = DAT_0001d2b4 + 0x1d110;
            *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
          }
        }
      }
      goto LAB_0001ca38;
    }
LAB_0001c78a:
    *piVar5 = iVar8 + 8;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x46:
switchD_0001c684_caseD_46:
    piVar5 = (int *)FUN_00022c1c(param_1);
    goto LAB_0001ca38;
  case 0x47:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar5 + 1) = 5;
    iVar4 = 10;
    iVar10 = DAT_0001cb38 + 0x1c930;
LAB_0001c92e:
    piVar5[2] = iVar8;
    piVar5[3] = iVar10;
    piVar5[4] = iVar4;
    *piVar5 = DAT_0001cb3c + 0x1c942;
LAB_0001c93c:
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    goto LAB_0001ca40;
  case 0x4b:
  case 0x56:
  case 0x72:
    uVar17 = (uint)(bVar1 == 0x72);
    if (uVar17 < uVar7) {
      uVar14 = 1;
      if (bVar1 == 0x72) {
        uVar14 = 2;
      }
      if (pbVar3[uVar17] != 0x56) {
        uVar14 = uVar17;
      }
      if ((uVar14 < uVar7) && (pbVar3[uVar14] == 0x4b)) {
        uVar14 = uVar14 + 1;
      }
      if (uVar14 < uVar7) {
        if (pbVar3[uVar14] == 0x46) goto switchD_0001c684_caseD_46;
        if ((pbVar3[uVar14] == 0x44) && (uVar14 + 1 < uVar7)) {
          uVar7 = pbVar3[uVar14 + 1] - 0x6f;
          if (((uVar7 < 10) && ((1 << (uVar7 & 0xff) & 0x301U) != 0)) ||
             (pbVar3[uVar14 + 1] == 0x4f)) goto switchD_0001c684_caseD_46;
        }
      }
    }
  case 0x55:
    piVar5 = (int *)FUN_00022e58(param_1);
    goto LAB_0001ca38;
  case 0x4d:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if ((iVar8 != 0) && (iVar4 = FUN_0001c660(param_1), iVar4 != 0)) {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      FUN_0001e9c0(piVar5,0xe,*(byte *)(iVar4 + 5) >> 6,1,1);
      piVar5[2] = iVar8;
      piVar5[3] = iVar4;
      iVar8 = DAT_0001cb40 + 0x1c998;
      goto LAB_0001cd0a;
    }
LAB_0001cd10:
    piVar5 = (int *)0x0;
    goto LAB_0001ca38;
  case 0x4f:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    goto joined_r0x0001cbae;
  case 0x50:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
    FUN_0001e9c0(piVar5,0xc,*(byte *)(iVar8 + 5) >> 6,1,1);
    piVar5[2] = iVar8;
    *piVar5 = DAT_0001cf08 + 0x1cc06;
    goto LAB_0001ca40;
  case 0x52:
    *param_1 = pbVar3 + 1;
    iVar8 = FUN_0001c660(param_1);
joined_r0x0001cbae:
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    piVar5 = (int *)FUN_00023378(param_1,&stack0xffffffd8,&stack0xffffffd4);
    goto LAB_0001ca40;
  case 0x53:
    if ((uVar7 < 2) || (pbVar3[1] != 0x74)) {
      piVar5 = (int *)FUN_0001defc(param_1,0,&stack0xffffffd4);
      if (piVar5 == (int *)0x0) {
        return (int *)0x0;
      }
      if ((char *)param_1[1] == (char *)*param_1) goto LAB_0001ca40;
      cVar2 = *(char *)*param_1;
joined_r0x0001c824:
      if (cVar2 == 'I') {
        FUN_0001d7c0(param_1 + 0x25,&stack0xffffffd0);
        iVar8 = FUN_0001df74(param_1,0);
        if (iVar8 == 0) {
          return (int *)0x0;
        }
        piVar5 = (int *)FUN_0001e168(param_1,&stack0xffffffd0,&stack0xffffffd8);
      }
      goto LAB_0001ca40;
    }
    goto switchD_0001c684_caseD_42;
  case 0x54:
    if (((uVar7 < 2) || (0x10 < pbVar3[1] - 0x65)) ||
       ((1 << (pbVar3[1] - 0x65 & 0xff) & DAT_0001cb14) == 0)) {
      piVar5 = (int *)FUN_0001e1e8(param_1);
      if (piVar5 == (int *)0x0) {
        return (int *)0x0;
      }
      if ((*(char *)(param_1 + 0x61) != '\x01') || ((char *)param_1[1] == (char *)*param_1))
      goto LAB_0001ca40;
      cVar2 = *(char *)*param_1;
      goto joined_r0x0001c824;
    }
switchD_0001c684_caseD_42:
    piVar5 = (int *)FUN_000232b4(param_1);
LAB_0001ca38:
    if (piVar5 == (int *)0x0) {
      return (int *)0x0;
    }
LAB_0001ca40:
    FUN_0001d7c0(param_1 + 0x25,&stack0xffffffd0);
    return piVar5;
  case 0x61:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cf10 + 0x1cc24);
    goto LAB_0001cc22;
  case 0x62:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb18 + 0x1c834;
    break;
  case 99:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cf14 + 0x1cc3c;
    break;
  case 100:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb20 + 0x1c856);
LAB_0001c854:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023170 + 0x23162;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x65:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cefc + 0x1cb70);
LAB_0001cc22:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00022ff0 + 0x22fe2;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x66:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb10 + 0x1c7e2;
    goto LAB_0001c9a0;
  case 0x67:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb24 + 0x1c86e);
LAB_0001c86c:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_000231b0 + 0x231a2;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x68:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb4c + 0x1caf2);
    goto LAB_0001caf0;
  case 0x69:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb30 + 0x1c8ce;
    goto LAB_0001c8cc;
  case 0x6a:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cf00 + 0x1cb7a);
LAB_0001cb78:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023070 + 0x23062;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x6c:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb28 + 0x1c8ac;
    break;
  case 0x6d:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb0c + 0x1c7d8);
LAB_0001caf0:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023030 + 0x23022;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x6e:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb08 + 0x1c7c0;
    goto LAB_0001c7be;
  case 0x6f:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb2c + 0x1c8b6);
LAB_0001c8b4:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00023130 + 0x23122;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x73:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb44 + 0x1c9a2;
LAB_0001c9a0:
    piVar5 = (int *)FUN_00020274(param_1,iVar8);
    return piVar5;
  case 0x74:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cf04 + 0x1cb92;
    goto LAB_0001cb90;
  case 0x75:
    *param_1 = pbVar3 + 1;
    FUN_000224c2(&stack0xffffffd8,param_1);
    if (&stack0xfffffff8 == (undefined1 *)0x0) {
      return (int *)0x0;
    }
    pcVar11 = (char *)*param_1;
    if ((pcVar11 == (char *)param_1[1]) || (*pcVar11 != 'I')) {
      piVar5 = (int *)FUN_0001de44(param_1,&stack0xffffffd8);
      goto LAB_0001ca40;
    }
    *param_1 = pcVar11 + 1;
    iVar8 = FUN_0001c660(param_1);
    if (iVar8 == 0) {
      return (int *)0x0;
    }
    pcVar11 = (char *)*param_1;
    if (pcVar11 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar11 != 'E') {
      return (int *)0x0;
    }
    *param_1 = pcVar11 + 1;
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    *(undefined1 *)(piVar5 + 1) = 7;
    *piVar5 = DAT_0001cb48 + 0x1ca20;
    piVar5[2] = unaff_r6;
    piVar5[3] = (int)&stack0xfffffff8;
    piVar5[4] = iVar8;
    goto LAB_0001c93c;
  case 0x76:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb00 + 0x1c7ac;
    break;
  case 0x77:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cb1c + 0x1c83e);
LAB_0001c83c:
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    sVar6 = strlen(pcVar11);
    piVar5[2] = (int)pcVar11;
    piVar5[3] = sVar6;
    *(undefined1 *)(piVar5 + 1) = 8;
    *piVar5 = DAT_00020988 + 0x2097a;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
    return piVar5;
  case 0x78:
    *param_1 = pbVar3 + 1;
    pcVar11 = (char *)(DAT_0001cf0c + 0x1cc0c);
    goto LAB_0001cc0a;
  case 0x79:
    *param_1 = pbVar3 + 1;
    piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10,pbVar13,bVar1,param_3,param_4);
    *(undefined1 *)(piVar5 + 1) = 8;
    piVar5[2] = DAT_0001cae0 + 0x1c784;
    piVar5[3] = 0x12;
    iVar8 = DAT_0001cae4 + 0x1c78c;
    goto LAB_0001c78a;
  case 0x7a:
    *param_1 = pbVar3 + 1;
    iVar8 = DAT_0001cb04 + 0x1c7b6;
LAB_0001c8cc:
    piVar5 = (int *)FUN_0001e454(param_1,iVar8);
    return piVar5;
  }
LAB_0001cc3a:
  piVar5 = (int *)FUN_0001e94c(param_1,iVar8);
  return piVar5;
}


