## 🚗 Berechnung des Anhaltewegs

let geschwindigkeit = 130km/h;

let reaktionszeit = 1000ms;    

let bremszeit = 3s;                

### ── Reaktionsweg (während Fahrer reagiert, fährt Auto weiter) ──

fun distance(v: m/s, t: s) : m = v * t;

let reaktionsweg = distance(geschwindigkeit, reaktionszeit);

// 36.11 m/s * 1s = 36.11m

### ── Bremsweg (Durchschnittsgeschwindigkeit * Bremszeit) ──

let bremsweg = distance(geschwindigkeit, bremszeit);

// 36.11 m/s * 3s = 108.33m

### ── Gesamter Anhalteweg ──

let anhalteweg = reaktionsweg + bremsweg;

// 36.11m + 108.33m = 144.44m

### ── Vergleich: Mit Stadtgeschwindigkeit ──

let stadtgeschwindigkeit = 50km/h;   // → 13.88 m/s

let stadtreaktionsweg = distance(stadtgeschwindigkeit, reaktionszeit);

let stadtbremsweg = distance(stadtgeschwindigkeit, bremszeit);

let stadtanhalteweg = stadtreaktionsweg + stadtbremsweg;

// viel kürzer!

### ── Hindernis Entfernung ──

let hindernis = 100m;

let verbleibend = anhalteweg - hindernis;

## ⚡⚡ Berechnung totalEnergy

### Kinetische Energie

fun kineticEnergy(m: g, v: m/s) = 0.5 * m * v^2;

kineticEnergy(2 kg, 10 m/s);

### Potenzielle Energie

fun potentialEnergy(m: g, h: m, gAcc: m/s) = m * gAcc * h;

potentialEnergy(2 kg, 10 m, 9.81 m/s);

### Gesamtenergie

fun totalEnergy(m: g, v: m/s, h: m, gAcc: m/s) = kineticEnergy(m, v) + potentialEnergy(m, h, gAcc);

totalEnergy(2 kg, 10 m/s, 10 m, 9.81 m/s);

## 🏎️ Motion / Geschwindigkeit

### Geschwindigkeit nach Zeit

fun velocityAtTime(vZero: m/s, deltaV: m/s, t: s) = vZero + (deltaV / t) * t;

velocityAtTime(0 m/s, 20 m/s, 2s);

### Strecke bei Geschwindigkeitsänderung

fun distanceWithVelocityChange(vZero: m/s, deltaV: m/s, t: s) = vZero * t + 0.5 * (deltaV / t) * t^2;

distanceWithVelocityChange(5 m/s, 15 m/s, 5 s);

### Impuls

fun impulse(m: g, deltaV: m/s) = m * deltaV;

impulse(2 kg, 20 m/s);

### Kraft aus Impuls

fun forceFromImpulse(m: g, deltaV: m/s, t: s) = (m * deltaV) / t;

forceFromImpulse(2 kg, 20 m/s, 2 s);

### Durchschnittsgeschwindigkeit

fun averageVelocity(vZero: km/h, vOne: m/s) = (vZero + vOne) / 2;

averageVelocity(10 km/h, 20 m/s);


### Recursive
fun fact(n) = if n then n * fact(n - 1) else 1;

fun fib(n) = if n then (if n - 1 then fib(n - 1) + fib(n - 2) else 1) else 0;

Test already defined function, test z.B fact(5m)

### Semantic
fun distance(v: m/s, t: s): m = v * t;

distance(10 kg, 3 s);

let q = undefinedVar + 1;

let bad = 2 ^ 1.5;

### Term Rewriting

2 km;
500 cm;
200 ms;
3 km/h;
1 kg;

let a = 1 * x;
let b = 0 * x;
let c = x + 0;
let n = 2 ^ 1;

3 km + 200 m;
1 kg + 500 g;
2 h + 30 m;

velocityAtTime(0 m/s, 20 m/s, 2s);

