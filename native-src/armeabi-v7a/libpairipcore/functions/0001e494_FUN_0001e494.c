/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e494
 * Address  : 0001e494
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001e494(undefined4 *param_1)

{
  byte bVar1;
  byte *pbVar2;
  char *pcVar3;
  undefined4 *puVar4;
  int *piVar5;
  int *piVar6;
  uint uVar7;
  byte *pbVar8;
  int iVar9;
  int local_20;
  int *local_1c;
  
  pbVar2 = (byte *)*param_1;
  if ((pbVar2 == (byte *)param_1[1]) || (*pbVar2 != 0x53)) {
    return (int *)0x0;
  }
  pbVar8 = pbVar2 + 1;
  *param_1 = pbVar8;
  if ((byte *)param_1[1] != pbVar8) {
    bVar1 = *pbVar8;
    if (bVar1 < 0x61) {
      if (bVar1 == 0x5f) {
        *param_1 = pbVar2 + 2;
        if (param_1[0x25] == param_1[0x26]) {
          return (int *)0x0;
        }
        uVar7 = 0;
        goto LAB_0001e53a;
      }
    }
    else if (bVar1 < 0x7b) {
      iVar9 = 0;
      switch(bVar1) {
      case 0x61:
        break;
      case 0x62:
        iVar9 = 1;
        break;
      case 99:
      case 0x65:
      case 0x66:
      case 0x67:
      case 0x68:
        return (int *)0x0;
      case 100:
        iVar9 = 5;
        break;
      case 0x69:
        iVar9 = 3;
        break;
      default:
        if (bVar1 == 0x6f) {
          iVar9 = 4;
        }
        else {
          if (bVar1 != 0x73) {
            return (int *)0x0;
          }
          iVar9 = 2;
        }
      }
      *param_1 = pbVar2 + 2;
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar5 + 1) = 0x30;
      piVar5[2] = iVar9;
      *piVar5 = DAT_0001e5a8 + 0x1e57e;
      *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
      piVar6 = (int *)FUN_000222f0(param_1,piVar5);
      if (piVar6 != piVar5) {
        local_1c = piVar6;
        FUN_0001d7c0(param_1 + 0x25,&local_1c);
        return piVar6;
      }
      return piVar5;
    }
  }
  local_20 = 0;
  iVar9 = FUN_0001dac4(param_1,&local_20);
  if (iVar9 != 0) {
    return (int *)0x0;
  }
  pcVar3 = (char *)*param_1;
  if (pcVar3 == (char *)param_1[1]) {
    return (int *)0x0;
  }
  if (*pcVar3 != '_') {
    return (int *)0x0;
  }
  *param_1 = pcVar3 + 1;
  uVar7 = local_20 + 1;
  if ((uint)((int)(param_1[0x26] - param_1[0x25]) >> 2) <= uVar7) {
    return (int *)0x0;
  }
LAB_0001e53a:
  puVar4 = (undefined4 *)FUN_0002236c(param_1 + 0x25,uVar7);
  return (int *)*puVar4;
}


