/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020dac
 * Address  : 00020dac
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020dac(int param_1,undefined4 param_2)

{
  char cVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  char cVar5;
  char cVar6;
  char local_40 [4];
  undefined4 uStack_3c;
  undefined4 uStack_38;
  undefined4 uStack_34;
  undefined4 local_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  undefined4 uStack_24;
  char local_20 [8];
  
  if (0xf < *(uint *)(param_1 + 0xc)) {
    iVar2 = *(int *)(param_1 + 8);
    pcVar3 = local_20;
    for (iVar4 = 0; iVar4 != 0x10; iVar4 = iVar4 + 2) {
      cVar5 = *(char *)(iVar2 + iVar4);
      if ((byte)(cVar5 - 0x3aU) < 0xf6) {
        cVar5 = cVar5 + '\t';
      }
      cVar1 = *(char *)(iVar2 + iVar4 + 1);
      cVar6 = -0x30;
      if ((byte)(cVar1 - 0x3aU) < 0xf6) {
        cVar6 = -0x57;
      }
      *pcVar3 = cVar1 + cVar6 + cVar5 * '\x10';
      pcVar3 = pcVar3 + 1;
    }
    FUN_00020d7e(local_20);
    uStack_3c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    uStack_38 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    uStack_34 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    local_40[0] = '\0';
    local_40[1] = '\0';
    local_40[2] = '\0';
    local_40[3] = '\0';
    local_30 = 0;
    uStack_2c = uStack_3c;
    uStack_28 = uStack_38;
    uStack_24 = uStack_34;
    iVar2 = snprintf(local_40,0x20,(char *)(DAT_00020e38 + 0x20e22));
    FUN_0001dcd6(param_2,local_40,iVar2);
  }
  return;
}


