export function problem(lines) {
    console.time('timer');
    // MDC (min divisor comum)
    function calcMDC(a, b) {
        while (b !== 0) {
            var t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    let offset = 0; // isso
    let output = ""; // e isso da uma diferença absurda de desempenho
    const t = +lines[offset++];

    for (var i = 0; i < t; i++) {
        var a = +lines[offset++];
        var b = +lines[offset++];

        output += calcMDC(a, b) + "\n";
    }

    console.log(output);
    
    console.timeEnd('timer');
}
