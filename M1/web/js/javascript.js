/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function ()
{
   $("#filtra").keyup(function()
    {  
        // Preleva il valore
        var text = $("#filtra").val();
       
        $.ajax(
        {
            url: "Filter.json",
            data:{
              key: "search",
              q: text
            },
            dataType: 'json',
            success : function(data, state){
                aggiornaListaOggetti(data, state);
            },
            error : function(data, state){ 
                print("errore");//SI PUò GESTIRE PER INSERIRE UN TESTO IN CASO DI ERRORE
            }
        });
        
       // Funzione che viene richiamata in caso di successo
        function aggiornaListaOggetti (listaOgg)
        {
            if (listaOgg.length !== 0){
                $("#listaOggetti").empty();
            
                var newtrt = document.createElement("tr");
                var newtd1t = document.createElement("th");
                var newtd2t = document.createElement("th");
                var newtd3t = document.createElement("th");
                var newtd4t = document.createElement("th");
                var newtd5t = document.createElement("th");
                var newtd6t = document.createElement("th");
            
                var td1t = document.createTextNode("Nome");
                newtd1t.appendChild(td1t);
            
                var td2t = document.createTextNode("Foto");
                newtd2t.appendChild(td2t);
                
                var td3t = document.createTextNode("Descrizione");
                newtd3t.appendChild(td3t);
                
                var td4t = document.createTextNode("Quantità");
                newtd4t.appendChild(td4t);
                
                var td5t = document.createTextNode("Prezzo");
                newtd5t.appendChild(td5t);
                
                var td6t = document.createTextNode("Acquisto");
                newtd6t.appendChild(td6t);
                
                
                newtrt.appendChild(newtd1t);
                newtrt.appendChild(newtd2t);
                newtrt.appendChild(newtd3t);  
                newtrt.appendChild(newtd4t);
                newtrt.appendChild(newtd5t);
                newtrt.appendChild(newtd6t);
                
                $("#listaOggetti").append(newtrt);
                
                for(var oggetto in listaOgg){
                
                    var newtr = document.createElement("tr");
                    var newtd1 = document.createElement("td");
                    var newtd2 = document.createElement("td");
                    var newtd3 = document.createElement("td");
                    var newtd4 = document.createElement("td");
                    var newtd5 = document.createElement("td");
                    var newtd6 = document.createElement("td");
                
                    newtr.setAttribute("class", "pari");
                                
                    var td1 = document.createTextNode(listaOgg[oggetto].nome);
                    newtd1.appendChild(td1);
                    
                    var td2 = document.createElement("img");
                    td2.setAttribute("title", "Foto");
                    td2.setAttribute("alt", "Foto " + listaOgg[oggetto].nome);
                    td2.setAttribute("src", listaOgg[oggetto].foto);
                    td2.setAttribute("width", "120");
                    td2.setAttribute("height", "140");
                    newtd2.appendChild(td2);
                
                    var td3 = document.createTextNode(listaOgg[oggetto].descrizione);
                    newtd3.appendChild(td3);
                    
                    var td4 = document.createTextNode(listaOgg[oggetto].quantita + " pezzi ancora disponibili");
                    newtd4.appendChild(td4);
                    
                    var td5 = document.createTextNode(listaOgg[oggetto].prezzo + " €");
                    newtd5.appendChild(td5);
                
                    var link = document.createElement("a");
                    link.setAttribute("href", "Cliente.jsp?IdOggetto=" + listaOgg[oggetto].id_o);
                    var registraTxt = document.createTextNode("Link di acquisto del prodotto");
                    link.appendChild(registraTxt);
                    newtd6.appendChild(link);
                
                    newtr.appendChild(newtd1);
                    newtr.appendChild(newtd2);
                    newtr.appendChild(newtd3);
                    newtr.appendChild(newtd4);
                    newtr.appendChild(newtd5);
                    newtr.appendChild(newtd6);
                    
                    $("#listaOggetti").append(newtr); 
                }
            }

                else {
                $("#listaOggetti").empty();
                $("#paragrafo").empty();
                
                var ad = document.createTextNode("Nessun oggetto trovato");
               
                $("#paragrafo").append(ad);
            }

        }
    }); 
});