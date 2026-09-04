/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d34c
 * Address  : 0001d34c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001d34c(undefined4 *param_1,int param_2)

{
  char cVar1;
  char *pcVar2;
  undefined4 uVar3;
  char *pcVar4;
  undefined1 uVar5;
  char *pcVar6;
  int iVar7;
  int iVar8;
  int local_7c [2];
  int local_74 [19];
  uint local_28;
  
  pcVar4 = (char *)*param_1;
  pcVar2 = (char *)param_1[1];
  if (pcVar2 == pcVar4) {
LAB_0001d38a:
    local_28 = local_28 & 0xffffff00;
    local_74[0] = FUN_0001defc(param_1,param_2,&local_28);
    if (local_74[0] != 0) {
      if (((char *)param_1[1] == (char *)*param_1) || (*(char *)*param_1 != 'I')) {
        if ((char)local_28 != '\0') {
          return 0;
        }
        return local_74[0];
      }
      if ((char)local_28 == '\0') {
        FUN_0001d7c0(param_1 + 0x25,local_74);
      }
      local_7c[0] = FUN_0001df74(param_1,param_2 != 0);
      if (local_7c[0] != 0) {
        if (param_2 != 0) {
          *(undefined1 *)(param_2 + 1) = 1;
        }
        iVar7 = FUN_0001e168(param_1,local_74,local_7c);
        return iVar7;
      }
    }
    return 0;
  }
  pcVar6 = pcVar4 + 1;
  if (*pcVar4 == 'Z') {
    *param_1 = pcVar6;
    local_28 = FUN_0001bef4(param_1);
    if (local_28 == 0) {
      return 0;
    }
    pcVar2 = (char *)*param_1;
    if (pcVar2 == (char *)param_1[1]) {
      return 0;
    }
    if (*pcVar2 != 'E') {
      return 0;
    }
    pcVar4 = pcVar2 + 1;
    *param_1 = pcVar4;
    if ((pcVar4 != (char *)param_1[1]) && (*pcVar4 == 's')) {
      *param_1 = pcVar2 + 2;
      uVar3 = FUN_000226f6();
      *param_1 = uVar3;
      local_74[0] = FUN_0002275c(param_1,DAT_0001d63c + 0x1d43e);
      iVar7 = FUN_0002279c(param_1,&local_28,local_74);
      return iVar7;
    }
    FUN_0001d2f0(local_74,param_1);
    pcVar2 = (char *)*param_1;
    if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'd')) {
      local_7c[0] = FUN_0001d34c(param_1,param_2);
      if (local_7c[0] != 0) {
        uVar3 = FUN_000226f6(*param_1,param_1[1]);
        *param_1 = uVar3;
LAB_0001d612:
        iVar7 = FUN_0002279c(param_1,&local_28,local_7c);
        goto LAB_0001d622;
      }
    }
    else {
      *param_1 = pcVar2 + 1;
      FUN_0001c5c0(local_7c,param_1,1);
      pcVar2 = (char *)*param_1;
      if ((pcVar2 != (char *)param_1[1]) && (*pcVar2 == '_')) {
        *param_1 = pcVar2 + 1;
        local_7c[0] = FUN_0001d34c(param_1,param_2);
        if (local_7c[0] != 0) goto LAB_0001d612;
      }
    }
    iVar7 = 0;
LAB_0001d622:
    FUN_0001d8ec(local_74);
    return iVar7;
  }
  if (*pcVar4 != 'N') goto LAB_0001d38a;
  *param_1 = pcVar6;
  if ((pcVar6 == pcVar2) || (*pcVar6 != 'H')) {
    uVar3 = FUN_0001e1a4(param_1);
    if (param_2 != 0) {
      *(undefined4 *)(param_2 + 4) = uVar3;
    }
    pcVar4 = (char *)*param_1;
    pcVar2 = (char *)param_1[1];
    if (pcVar4 == pcVar2) {
LAB_0001d482:
      if (param_2 == 0) goto LAB_0001d490;
      uVar5 = 0;
      iVar7 = 8;
    }
    else {
      pcVar6 = pcVar4 + 1;
      if (*pcVar4 == 'O') {
        *param_1 = pcVar6;
        pcVar4 = pcVar6;
        if (param_2 == 0) goto LAB_0001d490;
        uVar5 = 2;
      }
      else {
        if (*pcVar4 != 'R') goto LAB_0001d482;
        *param_1 = pcVar6;
        pcVar4 = pcVar6;
        if (param_2 == 0) goto LAB_0001d490;
        uVar5 = 1;
      }
      iVar7 = 8;
      pcVar4 = pcVar6;
    }
  }
  else {
    pcVar4 = pcVar4 + 2;
    *param_1 = pcVar4;
    if (param_2 == 0) goto LAB_0001d490;
    uVar5 = 1;
    iVar7 = 0x10;
  }
  *(undefined1 *)(param_2 + iVar7) = uVar5;
LAB_0001d490:
  local_74[0] = 0;
  iVar7 = 0;
LAB_0001d4a6:
  do {
    if ((pcVar4 != pcVar2) && (*pcVar4 == 'E')) {
      *param_1 = pcVar4 + 1;
      if (iVar7 == 0) {
        return 0;
      }
      if (param_1[0x25] == param_1[0x26]) {
        return 0;
      }
      param_1[0x26] = param_1[0x26] + -4;
      return iVar7;
    }
    if (param_2 != 0) {
      *(undefined1 *)(param_2 + 1) = 0;
    }
    if (pcVar2 == pcVar4) {
LAB_0001d542:
      iVar8 = 0;
LAB_0001d544:
      iVar7 = FUN_0001e5ac(param_1,param_2,iVar7,iVar8);
LAB_0001d54e:
      if (iVar7 == 0) {
        return 0;
      }
    }
    else {
      cVar1 = *pcVar4;
      if (cVar1 == 'D') {
        if (((uint)((int)pcVar2 - (int)pcVar4) < 2) || ((byte)(pcVar4[1] | 0x20U) != 0x74))
        goto LAB_0001d542;
        if (iVar7 != 0) {
          return 0;
        }
        iVar7 = FUN_0001e3d8(param_1);
        goto LAB_0001d54e;
      }
      if (cVar1 != 'I') {
        if (cVar1 != 'S') {
          if (cVar1 != 'T') goto LAB_0001d542;
          if (iVar7 != 0) {
            return 0;
          }
          iVar7 = FUN_0001e1e8(param_1);
          goto LAB_0001d54e;
        }
        if (((uint)((int)pcVar2 - (int)pcVar4) < 2) || (pcVar4[1] != 't')) {
          iVar8 = FUN_0001e494(param_1);
          if (iVar8 == 0) {
            return 0;
          }
        }
        else {
          *param_1 = pcVar4 + 2;
          iVar8 = FUN_0001e454(param_1,DAT_0001d638 + 0x1d524);
        }
        if (*(char *)(iVar8 + 4) == '\x1b') goto LAB_0001d544;
        if (iVar7 != 0) {
          return 0;
        }
        pcVar4 = (char *)*param_1;
        pcVar2 = (char *)param_1[1];
        iVar7 = iVar8;
        local_74[0] = iVar8;
        goto LAB_0001d4a6;
      }
      if (iVar7 == 0) {
        return 0;
      }
      local_7c[0] = FUN_0001df74(param_1,param_2 != 0);
      if (local_7c[0] == 0) {
        return 0;
      }
      if (*(char *)(iVar7 + 4) == '-') {
        return 0;
      }
      if (param_2 != 0) {
        *(undefined1 *)(param_2 + 1) = 1;
      }
      iVar7 = FUN_0001e168(param_1,local_74,local_7c);
    }
    local_74[0] = iVar7;
    FUN_0001d7c0(param_1 + 0x25,local_74);
    pcVar4 = (char *)*param_1;
    pcVar6 = (char *)param_1[1];
    pcVar2 = pcVar4;
    if ((pcVar4 != pcVar6) && (pcVar2 = pcVar6, *pcVar4 == 'M')) {
      pcVar4 = pcVar4 + 1;
      *param_1 = pcVar4;
    }
  } while( true );
}


