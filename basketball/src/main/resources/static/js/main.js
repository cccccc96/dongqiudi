$(document).ready(function () {
    const margin = {top: 20, right: 0, bottom: 0, left: 235},
        width = 1200 - 145 - margin.right,
        height = 500 - margin.top - margin.bottom,
        cellWidth = Math.floor(width / 42),
        cellHeight = cellWidth + 2,
        lenghdWid = cellWidth * 3,
        colors1 = [],
        times = ["第一节", "第二节", "第三节", "第四节"],
        bins = [.1, .2, .3, .4, .5, .6, .7, .8, .9];

    for (var i = .05; i < 1; i += .1) {
        colors1.push(d3.interpolateRdPu(i));
    }

    // 图像区域
    var svg = d3.select("#heatmap").append("svg")
        .attr("width", width + margin.left + margin.right)
        .attr("height", height + margin.top + margin.bottom)
        .append("g")
        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

    // 颜色区域模块划分
    var colorScale = d3.scaleThreshold()
        .domain(bins)
        .range(colors1);
    svg.selectAll(".timeLabel")
        .data(times)
        .enter().append("text")
        .text(function (d) {
            return d;
        })
        .attr("x", function (d, i) {
            return 12 * i * cellWidth;
        })
        .attr("y", 0)
        .attr("class", "time_label")
        .style("text-anchor", "middle")
        .attr("transform", "translate(" + cellWidth / 2 + ", -6)");
    var legend = d3.select(".legend").append("g");
    legend.selectAll("rect").data(colors1).enter().append("rect")
        .attr("x", function (d, i) {
            return lenghdWid * i;
        })
        .attr("y", 15)
        .attr("class", "legend_rect")
        .attr("width", lenghdWid)
        .attr("height", cellHeight)
        .style("fill", function (d) {
            return d;
        });
    var legend_labels = [0].concat(bins);
    legend.selectAll("text").data(legend_labels).enter().append("text")
        .attr("class", "legend_label")
        .text(function (d) {
            return parseInt(d * 100) + "%-" + parseInt((d + .1) * 100) + "%";
        })
        .attr("x", function (d, i) {
            return (lenghdWid * i) + 2;
        })
        .attr("y", 12);

    $("#team").on("change", drawHeatMap);
    $("#year").on("change", drawHeatMap);
    drawHeatMap();

    function drawHeatMap() {
        team_abr = $("#team")[0].value;
        year = $("#year")[0].value;
        var params = {};
        params.TeamName = team_abr;
        params.year = year;
        console.log("2", params.year)
        console.log("3", params.TeamName)
        $.ajax({
            type: "GET",
            async: false,            //异步请求
            url: "/ball/getPlayer/" + year + "/" + team_abr,    //请求发送到ball处
            data: {
                "year": year,
                "TeamName": team_abr
            },
            dataType: "json",
            success: function (data) {
                console.log(data);
                let list_len = data.length;
                const players = [];
                const minute_values = [];
                for (let i = 0; i < data.length; i++) {
                    players.push(data[i].playerName);
                    minute_values.push(+data[i].item_1);
                    minute_values.push(+data[i].item_2);
                    minute_values.push(+data[i].item_3);
                    minute_values.push(+data[i].item_4);
                    minute_values.push(+data[i].item_5);
                    minute_values.push(+data[i].item_6);
                    minute_values.push(+data[i].item_7);
                    minute_values.push(+data[i].item_8);
                    minute_values.push(+data[i].item_9);
                    minute_values.push(+data[i].item_10);
                    minute_values.push(+data[i].item_11);
                    minute_values.push(+data[i].item_12);
                    minute_values.push(+data[i].item_13);
                    minute_values.push(+data[i].item_14);
                    minute_values.push(+data[i].item_15);
                    minute_values.push(+data[i].item_16);
                    minute_values.push(+data[i].item_17);
                    minute_values.push(+data[i].item_18);
                    minute_values.push(+data[i].item_19);
                    minute_values.push(+data[i].item_20);
                    minute_values.push(+data[i].item_21);
                    minute_values.push(+data[i].item_22);
                    minute_values.push(+data[i].item_23);
                    minute_values.push(+data[i].item_24);
                    minute_values.push(+data[i].item_25);
                    minute_values.push(+data[i].item_26);
                    minute_values.push(+data[i].item_27);
                    minute_values.push(+data[i].item_28);
                    minute_values.push(+data[i].item_29);
                    minute_values.push(+data[i].item_30);
                    minute_values.push(+data[i].item_31);
                    minute_values.push(+data[i].item_32);
                    minute_values.push(+data[i].item_33);
                    minute_values.push(+data[i].item_34);
                    minute_values.push(+data[i].item_35);
                    minute_values.push(+data[i].item_36);
                    minute_values.push(+data[i].item_37);
                    minute_values.push(+data[i].item_38);
                    minute_values.push(+data[i].item_39);
                    minute_values.push(+data[i].item_40);
                    minute_values.push(+data[i].item_41);
                    minute_values.push(+data[i].item_42);
                    minute_values.push(+data[i].item_43);
                    minute_values.push(+data[i].item_44);
                    minute_values.push(+data[i].item_45);
                    minute_values.push(+data[i].item_46);
                    minute_values.push(+data[i].item_47);
                    minute_values.push(+data[i].item_48);
                }

                const player_labels = svg.selectAll("text.player_label").data(players);
                player_labels.enter().append("text")
                    .attr("x", 0)
                    .attr("class", "player_label")
                    .style("text-anchor", "end")
                    .merge(player_labels)
                    .text(function (d) {
                        return d;
                    })
                    .attr("y", function (d, i) {
                        return i * cellHeight;
                    })
                    .attr("transform", "translate(-2," + cellHeight / 1.5 + ")")

                player_labels.exit().remove();

                const minute_rects = svg.selectAll("rect.minute")
                    .data(minute_values);
                console.log(minute_rects);
                minute_rects.exit().remove();
                minute_rects.enter().append("rect")
                    .attr("rx", 4)
                    .attr("ry", 4)
                    .attr("width", cellWidth)
                    .attr("height", cellHeight)
                    .attr("class", "bordered minute")
                    .style("fill", colors1[0])
                    .merge(minute_rects)
                    .attr("x", function (d, i) {
                        return (i % 48) * cellWidth;
                    })
                    .attr("y", function (d, i) {
                        return Math.floor(i / 48) * cellHeight;
                    })

                d3.selectAll("rect.minute").transition().duration(500)
                    .style("fill", function (d) {
                        return colorScale(d);
                    });
            }, error: function (data) {
                console.log("出现异常，异常原因【" + data + "】!");
            }
        })
    }

    var margin2 = {top: 20, right: 0, bottom: 0, left: 235},
        width2 = 1200 - 145 - margin2.right,
        height2 = 500 - margin2.top - margin2.bottom,
        cellWidth2 = Math.floor(width2 / 42),
        cellHeight2 = cellWidth2 + 2,
        lenghdWid2 = cellWidth2 * 3,
        colors2 = [],
        times2 = ["第一节", "第二节", "第三节", "第四节"],
        bins2 = [.1, .2, .3, .4, .5, .6, .7, .8, .9];

    for (let i = .05; i < 1; i += .1) {
        colors2.push(d3.interpolateGnBu(i));
    }

    // 图像区域
    var svg2 = d3.select("#heatmap2").append("svg")
        .attr("width", width2 + margin2.left + margin2.right)
        .attr("height", height2 + margin2.top + margin2.bottom)
        .append("g")
        .attr("transform", "translate(" + margin2.left + "," + margin2.top + ")");

    var colorScale2 = d3.scaleThreshold()
        .domain(bins2)
        .range(colors2);
    svg2.selectAll(".timeLabel2")
        .data(times2)
        .enter().append("text")
        .text(function (d) {
            return d;
        })
        .attr("x", function (d, i) {
            return 12 * i * cellWidth2;
        })
        .attr("y", 0)
        .attr("class", "time_label2")
        .style("text-anchor", "middle")
        .attr("transform", "translate(" + cellWidth2 / 2 + ", -6)");
    var legend2 = d3.select(".legend2").append("g");
    legend2.selectAll("rect").data(colors2).enter().append("rect")
        .attr("x", function (d, i) {
            return lenghdWid2 * i;
        })
        .attr("y", 15)
        .attr("class", "legend_rect2")
        .attr("width", lenghdWid2)
        .attr("height", cellHeight2)
        .style("fill", function (d) {
            return d;
        });
    var legend_labels2 = [0].concat(bins2);
    legend2.selectAll("text").data(legend_labels2).enter().append("text")
        .attr("class", "legend_label2")
        .text(function (d) {
            return parseInt(d * 100) + "%-" + parseInt((d + .1) * 100) + "%";
        })
        .attr("x", function (d, i) {
            return (lenghdWid2 * i) + 2;
        })
        .attr("y", 12);

    $("#team2").on("change", drawHeatMap2);
    drawHeatMap2();

    function drawHeatMap2() {
        playerName = $("#team2")[0].value;
        $.ajax({
            type: "GET",
            async: false,            //异步请求
            url: "/ball/getHistoryPlayer/" + playerName,    //请求发送到ball处
            dataType: "json",
            success: function (data) {
                console.log("data2", data);
                const players = [];
                const minute_values = [];
                const years = [];
                for (let i = 0; i < data.length; i++) {
                    players.push(data[i].playerName);
                    years.push(data[i].year + " " + data[i].playerName);
                    minute_values.push(+data[i].item_1);
                    minute_values.push(+data[i].item_2);
                    minute_values.push(+data[i].item_3);
                    minute_values.push(+data[i].item_4);
                    minute_values.push(+data[i].item_5);
                    minute_values.push(+data[i].item_6);
                    minute_values.push(+data[i].item_7);
                    minute_values.push(+data[i].item_8);
                    minute_values.push(+data[i].item_9);
                    minute_values.push(+data[i].item_10);
                    minute_values.push(+data[i].item_11);
                    minute_values.push(+data[i].item_12);
                    minute_values.push(+data[i].item_13);
                    minute_values.push(+data[i].item_14);
                    minute_values.push(+data[i].item_15);
                    minute_values.push(+data[i].item_16);
                    minute_values.push(+data[i].item_17);
                    minute_values.push(+data[i].item_18);
                    minute_values.push(+data[i].item_19);
                    minute_values.push(+data[i].item_20);
                    minute_values.push(+data[i].item_21);
                    minute_values.push(+data[i].item_22);
                    minute_values.push(+data[i].item_23);
                    minute_values.push(+data[i].item_24);
                    minute_values.push(+data[i].item_25);
                    minute_values.push(+data[i].item_26);
                    minute_values.push(+data[i].item_27);
                    minute_values.push(+data[i].item_28);
                    minute_values.push(+data[i].item_29);
                    minute_values.push(+data[i].item_30);
                    minute_values.push(+data[i].item_31);
                    minute_values.push(+data[i].item_32);
                    minute_values.push(+data[i].item_33);
                    minute_values.push(+data[i].item_34);
                    minute_values.push(+data[i].item_35);
                    minute_values.push(+data[i].item_36);
                    minute_values.push(+data[i].item_37);
                    minute_values.push(+data[i].item_38);
                    minute_values.push(+data[i].item_39);
                    minute_values.push(+data[i].item_40);
                    minute_values.push(+data[i].item_41);
                    minute_values.push(+data[i].item_42);
                    minute_values.push(+data[i].item_43);
                    minute_values.push(+data[i].item_44);
                    minute_values.push(+data[i].item_45);
                    minute_values.push(+data[i].item_46);
                    minute_values.push(+data[i].item_47);
                    minute_values.push(+data[i].item_48);
                }

                const player_labels2 = svg2.selectAll("text.player_label2").data(years);
                player_labels2.enter().append("text")
                    .attr("x", 0)
                    .attr("class", "player_label2")
                    .style("text-anchor", "end")
                    .merge(player_labels2)
                    .text(function (d) {
                        return d;
                    })
                    .attr("y", function (d, i) {
                        return i * cellHeight2;
                    })
                    .attr("transform", "translate(-2," + cellHeight2 / 1.5 + ")")

                player_labels2.exit().remove();
                const minute_rects = svg2.selectAll("rect.minute2")
                    .data(minute_values);
                console.log(minute_rects);
                minute_rects.exit().remove();
                minute_rects.enter().append("rect")
                    .attr("rx", 4)
                    .attr("ry", 4)
                    .attr("width", cellWidth2)
                    .attr("height", cellHeight2)
                    .attr("class", "bordered minute2")
                    .style("fill", colors2[0])
                    .merge(minute_rects)
                    .attr("x", function (d, i) {
                        return (i % 48) * cellWidth2;
                    })
                    .attr("y", function (d, i) {
                        return Math.floor(i / 48) * cellHeight2;
                    })

                d3.selectAll("rect.minute2").transition().duration(500)
                    .style("fill", function (d) {
                        return colorScale2(d);
                    });
            }, error: function (data2) {
                console.log("出现异常，异常原因【" + data2 + "】!");
            }
        })
    }
});
