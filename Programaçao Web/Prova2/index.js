const botaoSomar = document.querySelector("#somar")
const botaoSubtrair = document.querySelector("#subitrair")
const botaoMultiplicar = document.querySelector("#multiplicar")
const botaoDividir = document.querySelector("#dividir")
const botaoRaiz = document.querySelector("#raiz")
const botaoQuadrado = document.querySelector("#quadrado")
const label = document.querySelector("#resultado")
botaoSomar.addEventListener("click",(e)=>{
    e.preventDefault()
    let valor1 = document.querySelector("#valor1").value
    let valor2 = document.querySelector("#valor2").value
    let somar = Number(valor1) + Number(valor2)
    
    label.innerHTML = somar
    console.log(somar)
})
botaoSubtrair.addEventListener("click",(e)=>{
    e.preventDefault()
    let valor1 = document.querySelector("#valor1").value
    let valor2 = document.querySelector("#valor2").value
    let subtrair = Number(valor1) - Number(valor2)
    label.innerHTML = subtrair
    console.log(subtrair)
})

botaoDividir.addEventListener("click",(e)=>{
    e.preventDefault()
    let valor1 = document.querySelector("#valor1").value
    let valor2 = document.querySelector("#valor2").value
    let dividir = Number(valor1) / Number(valor2)
    label.innerHTML = dividir
    console.log(dividir)
})
botaoMultiplicar.addEventListener("click",(e)=>{
    e.preventDefault()
    let valor1 = document.querySelector("#valor1").value
    let valor2 = document.querySelector("#valor2").value
    let multiplicar = Number(valor1) * Number(valor2)
    label.innerHTML = multiplicar
    console.log(multiplicar)
})
botaoRaiz.addEventListener("click",(e)=>{
    e.preventDefault()
    let valor1 = document.querySelector("#valor1").value
    let raiz = Math.sqrt(valor1)
    label.innerHTML = raiz
    console.log(raiz)
})
botaoQuadrado.addEventListener("click",(e)=>{
    e.preventDefault()
    let valor1 = document.querySelector("#valor1").value
    let quadrado = valor1*valor1
    label.innerHTML = quadrado
    console.log(quadrado)
})