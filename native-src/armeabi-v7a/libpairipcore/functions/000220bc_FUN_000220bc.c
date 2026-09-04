/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000220bc
 * Address  : 000220bc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_000220bc(undefined4 *param_1,undefined1 *param_2)

{
  byte bVar1;
  undefined1 uVar2;
  int iVar3;
  int *piVar4;
  byte *pbVar5;
  byte *pbVar6;
  int local_20 [2];
  
  iVar3 = FUN_0001fa3c();
  if (iVar3 == 0) {
    iVar3 = FUN_0001bec0(param_1,DAT_000221cc + 0x2211a,2);
    if (iVar3 == 0) {
      pbVar5 = (byte *)*param_1;
      if ((pbVar5 != (byte *)param_1[1]) && (*pbVar5 == 0x76)) {
        pbVar6 = pbVar5 + 1;
        *param_1 = pbVar6;
        if (((byte *)param_1[1] != pbVar6) && (*pbVar6 - 0x30 < 10)) {
          *param_1 = pbVar5 + 2;
          local_20[0] = FUN_0001dd58(param_1);
          if (local_20[0] != 0) {
            piVar4 = (int *)FUN_0002220c(param_1,local_20);
            return piVar4;
          }
        }
      }
    }
    else {
      iVar3 = FUN_0001dd58(param_1);
      if (iVar3 != 0) {
        piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
        piVar4[2] = iVar3;
        *(undefined1 *)(piVar4 + 1) = 0x14;
        *piVar4 = DAT_000221d0 + 0x22148;
        *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
        return piVar4;
      }
    }
  }
  else {
    bVar1 = *(byte *)(iVar3 + 2);
    if (bVar1 == 8) {
      uVar2 = *(undefined1 *)(param_1 + 0x61);
      *(undefined1 *)(param_1 + 0x61) = 0;
      bVar1 = *(byte *)((int)param_1 + 0x185);
      *(byte *)((int)param_1 + 0x185) = param_2 != (undefined1 *)0x0 | bVar1;
      local_20[0] = FUN_0001c660(param_1);
      if (local_20[0] == 0) {
        piVar4 = (int *)0x0;
      }
      else {
        if (param_2 != (undefined1 *)0x0) {
          *param_2 = 1;
        }
        piVar4 = (int *)FUN_0002220c(param_1,local_20);
      }
      *(undefined1 *)(param_1 + 0x61) = uVar2;
      *(byte *)((int)param_1 + 0x185) = bVar1;
      return piVar4;
    }
    if ((bVar1 < 0xb) && ((bVar1 != 4 || ((*(byte *)(iVar3 + 3) & 1) != 0)))) {
      FUN_00021842(local_20);
      piVar4 = (int *)FUN_0001e86c(param_1,local_20);
      return piVar4;
    }
  }
  return (int *)0x0;
}


